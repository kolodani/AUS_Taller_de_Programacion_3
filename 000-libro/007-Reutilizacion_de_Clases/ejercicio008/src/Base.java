/*
 *  Ejercicio 08:
 *  Cree una clase base que sólo tenga un constructor no predeterminado y una clase derivada que tenga un constructor
 *  predeterminado (sin argumentos) y otro no predeteminado, En los constructores de la clase derivada, invoque al
 *  constructor de la clase base.
*/

public class Base {
    public Base(int i){
        System.out.println("Clase Base: " + i);
    }
}
