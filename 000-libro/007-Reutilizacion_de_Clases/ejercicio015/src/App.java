/*
 *  Ejercicio 15:
 *  Cree una clase dentro de un paquete. Esa clase debe estar dentro de un paquete. Esa clase debe contener un método
 *  protected. Fuera del paquete, trate de invocar el método protected y explique los resultados. Ahora defina otra
 *  clase que herede de la anterior e invoque el método protected desde un método de la clase derivada.
*/

import perrera.Perro;

public class App {
    public static void main(String[] args) throws Exception {
        Perro dog = new Perro("Sparky");
        System.out.println(dog.toString());
        //! dog.setName("Grover");
        //? En la consola dice que el acceso a ese metodo es protegido y da error
        //? Ademas en el IDE me dice que el metodo no es visible antes de intenter correrlo
    }
}
