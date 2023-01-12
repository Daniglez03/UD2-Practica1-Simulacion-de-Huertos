public class Prodcutor extends Thread{

    public static String []Vegetables =  {
            "lettuce",
            "cabbage",
            "onion",
            "spinach",
            "potato",
            "celery",
            "asparagus",
            "radish",
            "broccoli",
            "artichoke",
            "tomato",
            "cucumber",
            "eggplant",
            "carrot",
            "green bean",
    };

    private String name;
    private int maxProduction;
    private int maxGrowTime;
    private Huerto huerto;

    public Prodcutor(String name, int farmerProduction, int maxGrowTime, Huerto huerto) {
        this.name = name;
        this.maxProduction = farmerProduction;
        this.maxGrowTime = maxGrowTime;
        this.huerto = huerto;
    }

    private String generarVerduras() {
        return Vegetables[(int) (Math.random() * Vegetables.length -1)];
    }

    private long getRandomGrowhTime() {
        return (long) (Math.random() * (this.maxGrowTime - 1) + 1);
    }

    @Override
    public void run() {
        for (int i = 0; i < this.maxProduction; i++) {
            try {
                String vegetableToProduce = this.generarVerduras();
                long growTime = this.getRandomGrowhTime();
                Thread.sleep(growTime * 1000);
                this.huerto.addVegetable(this.name, vegetableToProduce);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
