/*
 *  Ejercicio 12:
 *  Comience con un número cuyos dígitos binarios sean todos iguales a uno. A continuación desplácelo a la izquierda y
 *  utilice el operador de desplazamiento a la derecha sin signo para desplazarlo a través de todas sus posiciones
 *  binarias, visualizando los resultados con Integer.toBinaryString().
*/

public class App {
    public static void main(String[] args) throws Exception {
        int i = 0b11111111;
        System.out.println("i = " + Integer.toBinaryString(i));
        while (i != 0) {
            i <<= 1;
            System.out.println("i = " + Integer.toBinaryString(i));
        }
    }
}
