public class Forma02 {
    private int i;

    // Inicializacion a traves del constructor
    public Forma02() {
        i = 2;
    }

    public int getI() {
        return i;
    }

    public static void main(String[] args) {
        Forma02 f2 = new Forma02();
        System.out.println(f2.getI());
    }
}
