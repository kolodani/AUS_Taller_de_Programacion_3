/*
 *  Ejercicio 12:
 *  Modifique el Ejercicio 9 para que se muestre el orden de inicialización de
 *  las clases base y de las clases derivadas. Ahora añada objetos miembro a las
 *  clases base y derivadas, y muestre el orden en que se lleva a cabo la
 *  inicialización durante el proceso de construcción.
*/

public class Roedor {
    Miembro m1 = new Miembro("miembro de Roedor 1");
    Miembro m2 = new Miembro("miembro de Roedor 2");

    public void comer() {
        System.out.println("Roedor comiendo");
    }
    public void dormir() {
        System.out.println("Roedor durmiendo");
    }
    public void correr() {
        System.out.println("Roedor corriendo");
    }
    public String toString(){
        return "Roedor";
    }
}
