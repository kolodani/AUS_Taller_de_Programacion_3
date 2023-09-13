/*
 *  Ejercicio 19:
 *  Cree una clase con una referencia final en blanco a un objeto. Realice la inicialización de la referencia final en
 *  blanco dentro de todos los constructores. Demuestre que se garantiza que el valor final estará inicializado antes
 *  de utilizarlo, y que no se puede modificar una vez inicializado.
*/

public class App {
    private final Perro p1;
    public App(){
        p1 = new Perro("Sin nombre", 1);
    }
    public App(String nombre, int edad){
        p1 = new Perro(nombre, edad);
    }
    public static void main(String[] args) throws Exception {
        new App();
        new App("Luna", 8);
    }
}
