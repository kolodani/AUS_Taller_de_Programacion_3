/*
 *  Ejercicio 10:
 *  Escriba un programa que imprima tres argumentos extraídos de la línea de comandos. Para hacer
 *  esto, necesitará acceder con el índice correspondiente a la matriz de objetos String extraída de
 *  la linea de comandos.
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ingrese 3 argumentos: ");
        // System es una clase que representa al sistema operativo
        // console() es un método de la clase System que devuelve un objeto de tipo Consola
        // readLine() es un método de la clase Consola que lee una línea de texto
        String arg1 = System.console().readLine();
        String arg2 = System.console().readLine();
        String arg3 = System.console().readLine();
        System.out.println("Los argumentos ingresados son: " + arg1 + ", " + arg2 + ", " + arg3 + ".");
    }
}
