/*
 *  Ejercicio 08:
 *  Demuestre que las notaciones hexadecimal y octal funcionan con los valores long. Utilice
 *  Long.loBinarySlring( ) para mostrar los resultados.
*/

public class App {
    public static void main(String[] args) throws Exception {
        long n1 = 0x2f; // Hexadecimal (mayúsculas o minúsculas)
        long n2 = 0177; // Octal (cero al inicio)
        System.out.println("n1: " + Long.toBinaryString(n1));
        System.out.println("n2: " + Long.toBinaryString(n2));
    }
}
