public class Forma04 {

    private static final int MAX = 10;
    private final int i;

    public Forma04(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

        public static void main(String[] args) {
        Forma04 f1 = new Forma04(7);
        System.out.println(f1.getI());
        System.out.println(f1.MAX);
        Forma04 f2 = new Forma04(8);
        System.out.println(f2.MAX);
        System.out.println(MAX);
        System.out.println(Forma04.MAX);
    }
}
