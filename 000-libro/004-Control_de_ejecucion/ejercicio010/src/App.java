/*
 *  Ejercicio 10:
 *  Un numero vampiro tiene un número par de dígitos y se forma multiplicando una pareja de números que contengan la
 *  mitad del número de dígitos del resultado. Los dígitos se toman del número original en cualquier orden. No se
 *  permiten utilizar parejas de ceros finales. Entre los ejemplos tendríamos:
 *  1260 = 21 * 60
 *  1827 = 21 * 87
 *  2187 = 27 * 81
 *  Escriba un programa que determine todos los números vampiro de 4 dígitos (problema sugerido por Dan Forhan).
*/

public class App {
    public static void main(String[] args) throws Exception {
        int[] digitosInicio = new int[4];
        int[] digitosProducto = new int[4];
        for (int i = 10; i <= 99; i++) {
            for (int j = i; j <= 99; j++) {
                if ((i * j) % 9 != (i + j) % 9) {
                    continue;
                }
                int producto = i * j;
                digitosInicio[0] = i / 10;
                digitosInicio[1] = i % 10;
                digitosInicio[2] = j / 10;
                digitosInicio[3] = j % 10;
                digitosProducto[0] = producto / 1000;
                digitosProducto[1] = (producto % 1000) / 100;
                digitosProducto[2] = (producto % 1000 % 100) / 10;
                digitosProducto[3] = producto % 1000 % 100 % 10;
                int contador = 0;
                for (int k = 0; k < 4; k++) {
                    for (int l = 0; l < 4; l++) {
                        if (digitosProducto[k] == digitosInicio[l]) {
                            contador++;
                            digitosProducto[k] = -1;
                            digitosInicio[l] = -2;
                            if(contador == 4){
                                System.out.println(producto + " = " + i + " * " + j);
                            }
                        }
                    }
                }
            }
        }
    }
}
