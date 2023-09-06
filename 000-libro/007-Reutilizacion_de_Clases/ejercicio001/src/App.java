/*
 *  Ejercicio 01:
 *  Cree una clase simple. Dentro de una segunda clase, defina una referencia a un objeto de la segunda clase.
 *  Utilice el mecanismo de inicialización diferida para instanciar este objeto.
*/

public class App {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog("Grover");
        System.out.println(dog);
    }
}
