public class Main {

    public static void main(String[] args) {

        Huerto huerto = new Huerto(10);

        Prodcutor p = new Prodcutor("Daniel", 5, 4, huerto);
        Consumidor d = new Consumidor("Adrian", 5, 2, huerto);

        p.start();
        d.start();
    }
}