/*
 *  Ejercicio 05:
 *  Cree una clase con campos y métodos de tipo public, private, protected y con acceso de paquete. Cree un objeto de
 *  esa clase y vea los tipos de mensajes de compilación que se obtienen cuando se intenta acceder a todos los miembros
 *  de la clase. Tenga en cuenta que las clases que se encuentran en el mismo directorio forman parte del paquete
 *  "predeterminado",
 */

public class App {
    public static void main(String[] args) throws Exception {
        Perro p1 = new Perro();
        System.out.println("El nombre del perro es: " + p1.getNombre());
        System.out.println("La raza del perro es: " + p1.getRaza());
        System.out.println("La Edad del perro es: " + p1.getEdad());

        p1.setNombre("Grover");
        p1.setEdad(6);
        //p1.setRaza("Doberman");  el metodo no es visible porque se privado

        System.out.println("El nombre del perro es: " + p1.getNombre());
        System.out.println("La raza del perro es: " + p1.getRaza());
        System.out.println("La Edad del perro es: " + p1.getEdad());
    }
}
