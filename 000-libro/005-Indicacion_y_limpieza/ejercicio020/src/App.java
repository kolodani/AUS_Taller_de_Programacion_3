/*
 *  Ejercicio 20:
 *  Cree un método main() que utilice varargs en lugar de la sintaxis main() normal. Imprima todos los elementos de la
 *  matriz args resultante. Pruebe el método con diversos conjuntos de argumentos de línea de comandos.
*/

public class App {
    public static void main(String... args) {
        ImprimirString.imprimir(args);
    }
}
