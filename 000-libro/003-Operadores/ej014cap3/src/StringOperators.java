public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        System.out.println(s + x + y + z);
        System.out.println(x + " " + s);     // Convierte x a String
        System.out.println(s + (x + y + z));
        System.out.println("" + x);          // Abreviatura de Integer.toString()
    }
}
