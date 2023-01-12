public class Main {

    public static void main(String[] args) {

        Huerto huerto = new Huerto(10);

        Prodcutor p = new Prodcutor("Daniel", 5, 1, huerto);
        Consumidor d = new Consumidor("Adrian", 5, 5, huerto);

        p.start();
        d.start();
    }
}
