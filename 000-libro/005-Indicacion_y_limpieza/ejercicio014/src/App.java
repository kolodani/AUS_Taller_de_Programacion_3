/*
 *  Ejercicio 14:
 *  Cree una clase con un campo estático String que sea inicializado en el punto de definición, y otro campo que se
 *  inicialice mediante el bloque static. Añada un método static que imprima ambos campos y demuestre que ambos se
 *  inicializan antes de usarlos.
*/

public class App {
    public static void main(String[] args) throws Exception {
        Dog firulais = new Dog();
        System.out.println(firulais.edad);
        System.out.println(firulais.id);
    }
}
