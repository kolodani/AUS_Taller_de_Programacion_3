public class PilaDeLlamadas {
    public static void main(String[] args) {
        f1();
    }

    public static void f1() {
        try {
            f2();
        } catch (MeCortaronElCableException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static void f2() {
        f3();
    }

    public static void f3() {
        throw new MeCortaronElCableException();
    }
}
