/*
 *  Ejercicio 06:
 *  Cree una clase denominada Dog con un método sobrecargado bark() (método ··"ladrar"). Este método debe estar
 *  sobrecargado basándose en diversos tipos de datos primitivos y debe imprimir diferentes tipos de ladridos,
 *  gruñidos, etc .. dependiendo de la versión sobrecargada que se invoque. Escriba un método maín () que invoque todas
 *  las distintas versiones.
*/

public class App {
    public static void main(String[] args) throws Exception {
        Dog sparky= new Dog();
        sparky.bark();
        sparky.bark(4);
        sparky.bark('c');
        sparky.bark("Sparky");
    }
}
