/*
 *  Ejercicio 05:
 *  Cree una interfaz que contenga tres métodos en su propio paquete.
 *  Implemente la interfaz en un paquete diferente.
*/

public class App {
    public static void main(String[] args) throws Exception {
        Beagle snoppy = new Beagle();
        snoppy.ladrar();
        snoppy.comer();
        snoppy.dormir();
    }
}
