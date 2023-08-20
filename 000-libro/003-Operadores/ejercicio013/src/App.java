/*
 *  Ejercicio 13:
 *  Escriba el método que muestre valores char en formato binario. Ejecútelo utilizando varios caracteres diferentes.
*/

public class App {
    public static void main(String[] args) throws Exception {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        for (char c : chars) {
            System.out.println("El caracter " + c + " en binario es: " + Integer.toBinaryString(c));
        }
    }
}
