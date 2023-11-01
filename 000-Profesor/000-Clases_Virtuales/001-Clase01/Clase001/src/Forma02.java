public class Forma02 {
    // Inicializacion en la declaracion

    private int i;

    // Inicializacion en el constructor
    public Forma02() {
        i = 1;
    }
    public int getI() {
        return i;
    }

        public static void main(String[] args) {
        Forma02 f1 = new Forma02();
        System.out.println(f1.getI());
    }
}
