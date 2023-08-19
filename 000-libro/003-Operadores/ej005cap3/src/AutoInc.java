//: operators/AutoInc.java
// Ilustra los operadores ++ y --

public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i : " + i);
        System.out.println("++i : " + ++i); // Pre-incremento
        System.out.println("i++ : " + i++); // Post-incremento
        System.out.println("i : " + i);
        System.out.println("--i : " + --i); // Pre-decremento
        System.out.println("i-- : " + i--); // Post-decremento
        System.out.println("i : " + i);
    }
}
