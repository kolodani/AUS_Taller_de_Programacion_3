/*
 *  Ejercicio 16:
 *  Cree una matriz de objetos String y asigne un objeto String a cada elemento. Imprima la matriz utilizando un bucle
 *  for.
*/

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random(47);
        String a = "Grover";
        String[] matriz1 = new String[rand.nextInt(100)];
        for (int i = 0; i < matriz1.length; i++) {
            matriz1[i] = a;
            System.out.println("Posicion: " + i + " Elemento: " + matriz1[i]);
        }
    }
}
