/*
 *  Ejercicio 17:
 *  Utilizando la jerarquía Cyele del Ejercicio 1, añada un método balance() a Unicycle y Bicycle,
 *  pero no a Tricycle. Cree instancias de los tres tipos y generalícelas para formar una matriz de
 *  objetos Cycle. Trate de invocar balance() en cada elemento de la matriz y observe los
 *  resultados. Realice una especialización e invoque balance( ) y observe lo que sucede.
*/

public class Upcasting {
    public static void ride (Cycle c){}
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[]{
            new Unicycle(),
            new Bicycle(),
            new Tricycle()
        };
        // cycles[0].balance();  ||  No se puede llamar a
        // cycles[1].balance();  ||  balance() porque no
        // cycles[2].balance();  ||  está definido en Cycle
        ((Unicycle)cycles[0]).balance();    // Se puede llamar a balance()
        ((Bicycle)cycles[1]).balance();     // porque se hace un downcasting
        // ((Tricycle)cycles[2]).balance(); // Lanza una excepcion
    }
}
