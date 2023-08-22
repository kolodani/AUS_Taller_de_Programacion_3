/*
 *  Ejercicio 04:
 *  Escriba un programa que utilice dos bucles for anidados y el operador de módulo (%) para detectar e imprimir
 *  números primos (números enteros que no son divisibles por ningún número excepto por sí mismos y por 1).
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Numeros primos:");
        for (int i = 1; i <= 100; i++) {
            int contador = 0;
            for (int j = 1; j <= i; j++) {
                if((i % j) == 0){
                    contador++;
                }
            }
            if(contador == 2){
                System.out.println(i + " es numero primo");
            }
        }
    }
}
