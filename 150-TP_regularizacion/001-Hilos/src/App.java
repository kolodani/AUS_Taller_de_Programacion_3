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
        while (true) {
            File fileLeido = new File("/home/kolodani/bulk.txt");
            File fileErrores = new File("/home/kolodani/salida.log");
            try (BufferedReader br = new BufferedReader(new FileReader(fileLeido))) {
                String line;
                while ((line = br.readLine()) != null) {
                    Hilo hilo = new Hilo(line, fileErrores);
                    hilo.start();
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo");
            }
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                System.out.println("Error al dormir el hilo");
            }
        }
    }
}
