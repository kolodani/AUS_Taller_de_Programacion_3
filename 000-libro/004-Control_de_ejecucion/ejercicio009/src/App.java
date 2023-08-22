/*
 *  Ejercicio 09:
 *  Una secuencia de Fibonacci es la secuencia de números 1,1,2,3,5,8,13,21,34, etc., donde cada número (a partir del
 *  tercero) es la suma de los dos anteriores. Cree un método que tome un entero como argumento y muestre esa cantidad
 *  de números de Fibonacci comenzando por el principio de la secuencia; por ejemplo, si ejecuta java Fibonacci 5
 *  (donde Fibonacci es el nombre de la clase) la salida seria: 1,1,2,3,5.
*/

public class App {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(args[0]), inicio = 1, segundo = 1, tercero;
        System.out.print(inicio + " " + segundo + " ");
        for (int i = 2; i < n; i++) {
            tercero = inicio + segundo;
            System.out.print(tercero + " ");
            inicio = segundo;
            segundo = tercero;
        }
    }
}
