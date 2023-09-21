/*
 *  Ejercicio 21:
 *  Cree una clase con un método final. Cree otra clase que herede de la clase anterior y trate de
 *  sustituir ese método.
*/

public class App extends Perro {
    // @Override
    public void ladrar() {
        System.out.println("Miau!");
    }
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.ladrar();
    }
}
