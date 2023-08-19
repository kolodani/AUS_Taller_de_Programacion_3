//: operators/MathOps.java
// Ilustra los operadores matematicos.
import java.util.*;

public class MathOps {
    public static void main(String[] args) {
        // crea un generador de numeros aleatorios con una cierta semilla:
        Random rand = new Random(47);
        int i, j, k;
        // elegir valor entre 1 y 100;
        j = rand.nextInt(100) + 1;
        System.out.println("j: " + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k: " + k);
        i = j + k;
        System.out.println("j + k: " + i);
        i = j - k;
        System.out.println("j - k: " + i);
        i = k / j;
        System.out.println("k / j: " + i);
        i = k * j;
        System.out.println("k * j: " + i);
        i = k % j;
        System.out.println("k % j: " + i);
        j %= k;
        System.out.println("j %= k: " + j);
        // Pruebas con numeros en coma flotante:
        float u, v, w; // se aplica tambien a los doble precision
        v = rand.nextFloat();
        System.out.println("v: " + v);
        w = rand.nextFloat();
        System.out.println("w: " + w);
        u = v + w;
        System.out.println("v + w: " + u);
        u = v - w;
        System.out.println("v - w: " + u);
        u = v * w;
        System.out.println("v * w: " + u);
        u = v / w;
        System.out.println("v / w: " + u);
        // Lo siguiente tambien funciona para char,
        // byte, short, int, long y double:
        u += v;
        System.out.println("u += v: " + u);
        u -= v;
        System.out.println("u -= v: " + u);
        u *= v;
        System.out.println("u *= v: " + u);
        u /= v;
        System.out.println("u /= v: " + u);
    }
}
