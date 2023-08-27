/*
 *  Ejercicio 11:
 *  Modifique el ejercicio anterior de modo que siempre se invoque el método finalize().
*/

public class App {
    public static void main(String[] args) throws Exception {
        Dog firulais = new Dog();
        System.out.println(firulais.edad);
        System.gc();
        System.runFinalization();
    }
}
