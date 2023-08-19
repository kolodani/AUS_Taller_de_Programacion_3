/*
 *  Ejercicio 06:
 *  Continuando con el Ejercicio 5, cree una nueva referencia Dog y asígnela al objeto de nombre "spot".
 *  Realice una comparación utilizando = y equals() para todas las referencias.
*/

public class App {
    public static void main(String[] args) throws Exception {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.name = "spot";
        d1.says = "Ruff!";
        d2.name = "scruffy";
        d2.says = "Wurf!";
        Dog ejemplo = d1;

        System.out.println("d1 == d2: " + (d1 == d2));
        System.out.println("d1.equals(d2): " + d1.equals(d2));
        System.out.println("d1 == ejemplo: " + (d1 == ejemplo));
        System.out.println("d1.equals(ejemplo): " + d1.equals(ejemplo));
    }
}
