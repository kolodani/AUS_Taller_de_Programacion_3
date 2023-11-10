/*
 *  Enunciado:
 *  Necesitamos una app que se ejecute cada 1 min y que lea desde un archivo en disco ($HOME/bulk.txt)
 *  una lista de archivos, donde cada linea del archivo representa una ruta absoluta a un archivo particular.
 *  Dicha app debe procesar un conjunto de 10 entradas a la vez, en donde, cada entrada debe ser procesada de la forma:
 *  1) Si el archivo no existe, debe crearlo
 *  2) Si existe, debe borrarlo
 *  Si en alguno de los dos puntos anteriores falla, se debe generar un archivo de traza (salida.log) con los archivos
 *  que no se pudieron borrar/crear anteponiendo una B/C.
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        // bucle infinito para que se ejecute cada 1 minuto
        while (true) {
            // definimos los archivos a leer y escribir
            File fileLeido = new File("/home/kolodani/bulk.txt");
            File fileErrores = new File("/home/kolodani/salida.log");
            // creo un arreglo con tamaño 10 para guardar las lineas del archivo
            String[] lineas = new String[10];
            // creo un contador para saber cuando llego a 10 lineas
            int i = 0;
            // leo el archivo en un try para que se cierre automaticamente y capturo la excepcion
            try (BufferedReader br = new BufferedReader(new FileReader(fileLeido))) {
                // variable para guardar cada linea del archivo
                String line;
                // bucle para leer el archivo mientras haya lineas y no sean null (fin de archivo)
                while ((line = br.readLine()) != null) {
                    // guardo la linea en el arreglo
                    lineas[i] = line;
                    // cuando guardo la linea 10 o llego al fin del archivo creo un hilo y lo ejecuto
                    if (i == 9 || line == null) {
                        // creo el hilo enviandole el arreglo con las lineas y el archivo de errores
                        Hilo hilo = new Hilo(lineas, fileErrores);
                        // ejecuto el hilo
                        hilo.start();
                        // reinicio el contador del arreglo a cero
                        i = 0;
                        // creo un nuevo arreglo para guardar las lineas
                        lineas = new String[10];
                    } else {
                        // si no llegue al fin de archivo o a llenar el arreglo aumento el contador
                        i++;
                    }
                }
                // si el arrglo no esta vacio creo un hilo y lo ejecuto
                // esto pasa porque el archivo se quedo sin lineas por ser leidas pero el arreglo no esta lleno
                if (lineas[0] != null) {
                    Hilo hilo = new Hilo(lineas, fileErrores);
                    hilo.start();
                }
            } catch (IOException e) {
                // capturo la excepcion en caso de que no se pueda leer el archivo y la muestro
                System.out.println("Error al leer el archivo " + e.getMessage() + "\n");
            }
            // duermo al programa por 1 minuto
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                // capturo la excepcion en caso de que no se pueda dormir el hilo y la muestro
                System.out.println("Error al dormir el hilo " + e.getMessage() + "\n");
            }
        }
    }
}
