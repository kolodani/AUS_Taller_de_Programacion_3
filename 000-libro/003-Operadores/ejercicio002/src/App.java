/*
 *  Ejercicio 02:
 *  Cree una clase que contenga el valor float y utilicela para ilustrar el fenómeno de la creación de alias.
 */

public class App {
    public static void main(String[] args) throws Exception {
        Contenedor c1 = new Contenedor();
        Contenedor c2 = new Contenedor();
        c1.numero = 1.1f;
        c2.numero = 2.2f;
        System.out.println("El valor de c1: " + c1.numero);
        System.out.println("El valor de c2: " + c2.numero);
        c1 = c2;
        System.out.println("El valor de c1: " + c1.numero);
        System.out.println("El valor de c2: " + c2.numero);
        c2.numero = 666.666f;
        System.out.println("El valor de c1: " + c1.numero);
        System.out.println("El valor de c2: " + c2.numero);
    }
}
