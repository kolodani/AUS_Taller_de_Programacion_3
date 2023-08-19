/*
 *  Ejercicio 01:
 *  Escriba un programa que emplee tanto la forma "corta" como la normal de la instrucción de impresión.
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String a = "Hello, World!";
        Print impresora = new Print();
        impresora.print(a);
    }
}
