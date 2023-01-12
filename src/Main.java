public class Main {

    public static void main(String[] args) {

        Huerto huerto = new Huerto(10);

        Prodcutor p = new Prodcutor("Daniel", 10, 4, huerto);

        Consumidor c = new Consumidor("Goyo", 5, 5, huerto);
        Consumidor d = new Consumidor("Adrian", 5, 2, huerto);
        p.start();
        c.start();
        d.start();
    }
}
