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

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        File fileLeido = new File("/home/kolodani/Documentos/PRUEBA/bulk.txt");
        File fileErrores = new File("/home/kolodani/Documentos/PRUEBA/salida.log");
        ReadFile linea;
        try (BufferedReader br = new BufferedReader(new FileReader(fileLeido))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null && i < 10) {
                linea = new ReadFile(line);
                if (!linea.aplicarAccion()) {
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileErrores, true))) {
                        bw.write("B/C " + line + "\n");
                    } catch (Exception e) {
                        System.out.println("Error al escribir en el archivo: " + fileErrores);
                    }
                }
                i++;
            }
        }
    }
}
