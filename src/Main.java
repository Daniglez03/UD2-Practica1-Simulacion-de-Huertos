public class Main {

    public static void main(String[] args) {

        Huerto huerto = new Huerto(10);

        Prodcutor p = new Prodcutor("Daniel", 4, 4, huerto);
        Consumidor d = new Consumidor("Adrian", 4, 2, huerto);

        p.setPriority(5);
        p.start();
        d.start();
    }
}
