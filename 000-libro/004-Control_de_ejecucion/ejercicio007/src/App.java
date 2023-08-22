/*
 *  Ejercicio 07:
 *  Modifique el Ejercicio 1 para que el programa termine usando la palabra clave break con el valor 99.
 *  Intente utilizar return en su lugar.
*/

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i < 100; i++) {
            System.out.println(i);
            if(i == 99) break;
        }
    }
}
