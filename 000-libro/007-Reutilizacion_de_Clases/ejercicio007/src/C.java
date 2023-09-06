/*
 *  Ejercicio 07:
 *  Modifique el Ejercicio 5 de modo que A y B tengan constructores con argumentos en lugar de constuctores
 *  predeterminados. Escriba un constructor para C que realice toda la inicialización dentro del constructor de C.
*/

public class C extends A{
    B b = new B("B");
    public C(){
        super(47);
        System.out.println("Clase C Construida");
    }

    public static void main(String[] args) {
        new C();
    }
}
