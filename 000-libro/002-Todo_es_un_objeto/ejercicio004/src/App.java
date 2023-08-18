/*
 *  Ejercicio 4:
 *  Transforme los fragmentos de código DataOnly en un programa que se pueda com pilar y ejecutar.
 */

public class App {
    public static void main(String[] args) throws Exception {
        DataOnly daOn = new DataOnly();
        daOn.i = 666;
        daOn.d = 5.5;
        daOn.b = true;

        System.out.println(daOn.i);
        System.out.println(daOn.d);
        System.out.println(daOn.b);
    }
}
