/*
 *  Ejercicio 03:
 *  Modifique el Ejercicio 2 para que el código quede rodeado por un bucle while ·'infinito". De este modo, el programa
 *  se ejecutará basta que lo interrumpa desde el teclado (nomlalmente, pulsando Control-C).
*/

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int primero, segundo, iterador = 0, i = 1;
        Random random = new Random();
        primero = random.nextInt(100);
        while(iterador == 0){
            segundo = random.nextInt(100);
            System.out.println(i + ")");
            if(segundo > primero){
                System.out.println("El valor es mayor al pivote");
            }
            else if (segundo < primero){
                System.out.println("El valor es menor al pivote");
            }
            else {
                System.out.println("El valor es igual al pivote");
            }
            i++;
        }
    }
}
