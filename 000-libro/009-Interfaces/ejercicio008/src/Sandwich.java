/*
 *  Ejercicio 08:
 *  En polymorphism.sandwich.java. cree una interfaz denominada FastFood (con los métodos
 *  apropiados) y cambie Sandwich de modo que también implemente FastFood .
*/

public class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();

    public Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}
