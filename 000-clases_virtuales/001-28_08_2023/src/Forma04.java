public class Forma04 {
    // final significa que no cambia
    // static mantiene el numero igual para todas las copias
    private static final int MAX = 10;
    private final int i;

    public Forma04(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public static void main(String[] args) {
        Forma04 f4 = new Forma04(7);
        System.out.println(f4.MAX);
        // el warning lo tira porque quiero acceser a algo de la clase a traves de una instancia
        System.out.println(f4.getI());
        Forma04 f4a = new Forma04(8);
        System.out.println(f4a.MAX);
        System.out.println(f4a.getI());
        System.out.println(Forma04.MAX);
    }
}
