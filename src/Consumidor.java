public class Consumidor extends Thread{
    private String name;
    private Huerto huerto;
    private int maxToConsume;
    private final long CONSUMING_TIME;

    public Consumidor(String clientName, int maxToConsume, int consumingTimeS, Huerto huerto) {
        this.name = clientName;
        this.maxToConsume = maxToConsume;
        this.huerto = huerto;
        this.CONSUMING_TIME = consumingTimeS * 1000;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.maxToConsume; i++) {
            try {
                String vegetableToConsume = this.huerto.consumeVegetable(this.name);
                Thread.sleep(this.CONSUMING_TIME);
                System.out.println(this.name + " ha consumido: " + vegetableToConsume);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
