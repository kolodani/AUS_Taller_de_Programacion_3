/*
 *  Ejercicio 18:
 *  Cree una clase con un campo static final y un campo final y demuestre la diferencia entre los dos.
*/

public class App {
    public static void main(String[] args) throws Exception {
        // creo 3 instancias de Heredero, en ellas se va a imprimir el valor de los campos a y b
        Heredero h1 = new Heredero();
        Heredero h2 = new Heredero();
        Heredero h3 = new Heredero();
        // los valores de los campos a y b van a ser distintos en cada instancia
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }
}
// salida:
// a = 1, b = 0
// a = 2, b = 0
// a = 3, b = 0
