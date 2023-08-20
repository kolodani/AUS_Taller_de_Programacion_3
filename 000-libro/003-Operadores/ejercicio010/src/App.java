/*
 *  Ejercicio 10:
 *  Escriba un programa con dos valores constantes, uno en el que haya unos y ceros binarios alternados, con un cero en
 *  el dígito menos significativo, y el segundo con un valor también alternado pero con un uno en el dígito menos
 *  significativo (consejo: lo más fácil es usar constantes hexadecimal es para esto). Tome estos dos valores y
 *  combínelos de todas las formas posibles utilizando los operadores bit a bit, y visualice los resultados utilizando
 *  Integer.toBinaryString().
*/

public class App {
    public static void main(String[] args) throws Exception {
        int a = 0xaaaaaaaa;
        int b = 0x55555555;
        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));
        System.out.println("a & b = " + Integer.toBinaryString(a & b));
        System.out.println("a | b = " + Integer.toBinaryString(a | b));
        System.out.println("a ^ b = " + Integer.toBinaryString(a ^ b));
        System.out.println("~a = " + Integer.toBinaryString(~a));
        System.out.println("~b = " + Integer.toBinaryString(~b));
    }
}
