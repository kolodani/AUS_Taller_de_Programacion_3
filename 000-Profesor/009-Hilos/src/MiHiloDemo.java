public class MiHiloDemo {
    public static void main(String[] args) {
        MiHilo m = new MiHilo();
        m.start();
        Thread t = new Thread(new MiHilo2());
        t.start();
        System.out.println("Chau");
    }
}
