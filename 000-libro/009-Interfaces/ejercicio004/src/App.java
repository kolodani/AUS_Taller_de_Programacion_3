/*
 *  Ejercicio 04:
 *  Cree una clase abstracta sin métodos. Defina una clase derivada y anádale un
 *  método. Cree un método estático que tome una referencia a la clase base,
 *  especialícelo para que apunte a la clase derivada e invoque el método. En
 *  main(), demuestre que este mecanismo funciona. Ahora, incluya la declaración
 *  abstracta del método en la clase base, eliminando así la necesidad de la
 *  especialización.
*/

public class App  {
    public static void test1(SinMetodos sm){
        // debe acceder a f() con downcast
        ((Extiende1)sm).f();
    }
    public static void test2(ConMetodos cm){
        // no necesita downcast
        cm.f();
    }
    public static void main(String[] args) {
        SinMetodos sm = new Extiende1();
        test1(sm);
        ConMetodos cm = new Extiende2();
        test2(cm);
    }
}
