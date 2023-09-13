/*
 *  Ejercicio 13:
 *  Cree una clase con un método que esté sobrecargado tres veces. Defina una nueva clase que herede de la anterior y
 *  añada una nueva versión sobrecargada del método. Muestre que los cuatro métodos están disponibles en la clase
 *  derivada.
*/

public class App {
    public static void main(String[] args) throws Exception {
        Beagle momo = new Beagle();
        momo.ladrar(666);
        momo.ladrar(12.34f);
        momo.ladrar('g');
        momo.ladrar("Sparky");
    }
}
