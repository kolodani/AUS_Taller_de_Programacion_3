/*
 *  Ejercicio 06:
 *  Modilique el ejercicio anterior de modo que dos de los métodos sobrecargados tengan dos argumentos (de dos tipos
 *  distintos). pero en orden inverso uno respecto del otro. Verifique que estas defíniciones funcionan.
*/

public class App {
    public static void main(String[] args) throws Exception {
        Dog sparky= new Dog();
        sparky.bark();
        sparky.bark('c');
        sparky.bark("Sparky", 4);
        sparky.bark(4, "Sparky");
    }
}
