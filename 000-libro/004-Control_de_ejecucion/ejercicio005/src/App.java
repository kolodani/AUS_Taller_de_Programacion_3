/*
 *  Ejercicio 05:
 *  Repita el Ejercicio 10 del capitulo anterior, utilizando el operador ternario y una comprobación de tipo bit a bit
 *  para mostrar los unos y ceros en lugar de lnteger.toBinaryString( ).
 *  -.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.
 *  Ejercicio anterior:
 *  Escriba un programa con dos valores constantes, uno en el que haya unos y ceros binarios alternados, con un cero en
 *  el dígito menos significativo, y el segundo con un valor también alternado pero con un uno en el dígito menos
 *  significativo (consejo: lo más fácil es usar constantes hexadecimal es para esto). Tome estos dos valores y
 *  combínelos de todas las formas posibles utilizando los operadores bit a bit, y visualice los resultados utilizando
 *  Integer.toBinaryString().
 */

public class App {
    public static void toBinaryString(int i){
        char[] buffer = new char[32];
        int bufferPosition = 32;
        do {
            buffer[--bufferPosition] = (i & 0x01) == 0 ? '0' : '1';
            i >>>= 1;
        } while (i != 0);
        for (int j = bufferPosition; j < 32; j++) {
            System.out.print(buffer[j]);
        }
    }
    public static void main(String[] args) throws Exception {
        int a = 0xaaaaaaaa;
        int b = 0x55555555;
        System.out.print("a = "); toBinaryString(a);
        System.out.print("\nb = "); toBinaryString(b);
        System.out.print("\n~a = "); toBinaryString(~a);
        System.out.print("\n~b = "); toBinaryString(~b);
        System.out.print("\na & a = "); toBinaryString(a & a);
        System.out.print("\na | a = "); toBinaryString(a | a);
        System.out.print("\na ^ a = "); toBinaryString(a ^ a);
        System.out.print("\na & b = "); toBinaryString(a & b);
        System.out.print("\na | b = "); toBinaryString(a | b);
        System.out.print("\na ^ b = "); toBinaryString(a ^ b);
    }
}
