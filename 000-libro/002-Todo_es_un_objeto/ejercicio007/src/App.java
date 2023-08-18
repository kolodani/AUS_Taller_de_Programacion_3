/*
 *  Ejercicio 7
 *  Transfonme los fragmento s de código lncremenlable eo un programa funcional.
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(StaticTest.i);
        Incrementable.increment();
        System.out.println(StaticTest.i);
    }
}
