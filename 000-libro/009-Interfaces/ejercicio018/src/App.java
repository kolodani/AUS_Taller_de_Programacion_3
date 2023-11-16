/*
 *  Ejercicio 18:
 *  Cree una interfaz Cycle, con implementaciones Unicycle, Bicycle y Tricycle. Cree factorias para cada tipo de Cycle
 *  y el código necesario que utilicen estas factorías.
*/

public class App {
    public static void ride (CycleFactory factory) {
        Cycle c = factory.getCycle();
        System.out.println("Number of wheels: " + c.wheels());
    }
    public static void main(String[] args) {
        ride(new UniCycleFactory());
        ride(new BicycleFactory());
        ride(new TricycleFactory());
    }
}
