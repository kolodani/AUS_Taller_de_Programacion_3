public class Ejemplo01 {
    public static void main(String[] args) {
        int j = 1;
        int i = 0;
        try {
            System.out.println( j / i );
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Todo ok");
    }
}
