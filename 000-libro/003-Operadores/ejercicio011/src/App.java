/*
 *  Ejercicio 11:
 *  Comience con un número que tenga un uno binario en la posición más significativa (consejo: utilice una constante
 *  hexadecimal). Emplee el operador de desplazamiento a la derecha con signo, desplace el valor a través de todas sus
 *  posiciones binarias, mostrando cada vez el resultado con Integer.toBinaryString( ).
*/

public class App {
    public static void main(String[] args) throws Exception {
        int i = 0x80000000;
        System.out.println("i = " + Integer.toBinaryString(i));
        for (int j = 0; j < 32; j++) {
            i >>>= 1;
            System.out.println("i = " + Integer.toBinaryString(i));
        }
    }
}
