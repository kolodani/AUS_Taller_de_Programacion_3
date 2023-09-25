/*
 *  Ejercicio 023:
 *  Demuestre que el proceso de carga de una clase sólo tiene lugar una vez.
 *  Demuestre que la carga puede ser provocada por la creación de la primera
 *  instancia de esa clase o por el acceso a un miembro estáticode la misma.
*/

public class App extends Perro{
    public static void main(String[] args) throws Exception {
        System.out.println("Llamada a Perro.ladra()");
        Perro.ladra();
        System.out.println("Creación de un objeto de la clase Perro");
        Perro p = new Perro();
    }
}
