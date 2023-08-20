public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f; // Hexadecimal (minuscula)
        System.out.println("i1: " + Integer.toBinaryString(i1));
        int i2 = 0X2F; // Hexadecimal (mayuscula)
        System.out.println("i2: " + Integer.toBinaryString(i2));
        int i3 = 0177; // Octal (cero)
        System.out.println("i3: " + Integer.toBinaryString(i3));
        char c = 0xffff; // Maximo valor de char hexadecimal
        System.out.println("c: " + Integer.toBinaryString(c));
        byte b = 0x7f; // Maximo valor de byte hexadecimal
        System.out.println("b: " + Integer.toBinaryString(b));
        short s = 0x7fff; // Maximo valor de short hexadecimal
        System.out.println("s: " + Integer.toBinaryString(s));
        long n1 = 200L; // Sufijo long
        long n2 = 200l; // Sufijo long (pero puede ser confuso)
        long n3 = 200;
        float f1 = 1;
        float f2 = 1F; // Sufijo float
        float f3 = 1f; // Sufijo float
        double d1 = 1d; // Sufijo double
        double d2 = 1D; // Sufijo double
        // (Hex y Octal tambien funcionan con long)
    }
}
