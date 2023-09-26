/*
 *  Ejercicio 05:
 *  Partiendo del Ejercicio 1, añada un método wheels() a Cycle, que devuelva el número de ruedas.
 *  Modifique ride() para invocar wheels() y verifique que funciona el polimorfismo.
*/

public class Upcasting {
    public static void ride (Cycle c){
        System.out.println("Numero de ruedas: " + c.wheels());
    }
    public static void main(String[] args) {
        ride(new Cycle());
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }
}
