import java.util.ArrayList;

public class Huerto {
    private int capacity;
    ArrayList<String> vegetablesAvailables = new ArrayList<>();

    public Huerto(int marketCapacity) {
        this.capacity = marketCapacity;
    }

    synchronized public void addVegetable(String farmerName, String newVegetable) throws InterruptedException{
        while (this.vegetablesAvailables.size() >= this.capacity) {
            wait();
        }

        this.vegetablesAvailables.add(newVegetable);
        System.out.println(farmerName + " ha producido " + newVegetable);
        notifyAll();
    }

    synchronized public String consumeVegetable(String clientName) throws InterruptedException {
        while (this.vegetablesAvailables.size() == 0) {
            wait();
        }
        String vegetableToConsume = this.vegetablesAvailables.remove(0);
        notifyAll();
        return vegetableToConsume;
    }
}
