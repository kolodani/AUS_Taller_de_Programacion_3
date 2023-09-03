/*
 *  Ejercicio 08:
 *  Siguiendo la foema del ejemplo Lunch.java. cree una clase denominada ConnectionManager que gestione una matriz fija
 *  de objetos Conncetion. El programa cliente no debe poder crear explícitamente objetos Conncetíon, sino que sólo
 *  debe poder obtenerlos a través de un método estático de ConnectionManager. Cuando ConnectionManager se quede sin
 *  objetos, devolverá una referencia oul!. Pruebe las clases con un programa main() .
 */

public class App {
    public static void main(String[] args) {
        Connection c = ConnectionManager.getConnection();
        while (c != null) {
            System.out.println(c);
            c.doSomething();
            c = ConnectionManager.getConnection();
        }
    }
}
