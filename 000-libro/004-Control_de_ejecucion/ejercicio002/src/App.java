/*
 *  Ejercicio 02:
 *  Escriba un programa que genere 25 valores int aleatorios. Para cada valor, utilice una instrucción if-else para
 *  clasificarlo como mayor que, menor que o igual a un segundo valor generado aleatoriamente.
*/

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int primero, segundo;
        Random random = new Random();
        primero = random.nextInt(100);
        for (int i = 0; i < 25; i++) {
            segundo = random.nextInt(100);
            System.out.println(i+1 + ")");
            if(segundo > primero){
                System.out.println("El valor es mayor al pivote");
            }
            else if (segundo < primero){
                System.out.println("El valor es menor al pivote");
            }
            else {
                System.out.println("El valor es igual al pivote");
            }
        }
    }
}
