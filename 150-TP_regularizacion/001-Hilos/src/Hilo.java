import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Hilo extends Thread{
    // arreglo de string para guardar las lineas del archivo
    private String[] linea;
    // variable para guardar el archivo de errores
    private File fileErrores;
    // variable para ejecutar el metodo aplicarAccion de la clase ReadFile
    private ReadFile readFile;

    // constructor que recibe el arreglo de string y el archivo de errores
    public Hilo(String[] linea, File fileErrores) {
        this.linea = linea;
        this.fileErrores = fileErrores;
    }

    // metodo run que se ejecuta al iniciar el hilo
    public void run() {
        // recorro el arreglo de string
        for (int i = 0; i < linea.length; i++) {
            // si la linea no es nula creo un objeto de la clase ReadFile
            if (linea[i] != null) {
                readFile = new ReadFile(linea[i]);
            }
            // ejecuto el metodo aplicarAccion de la clase ReadFile
            if (!readFile.aplicarAccion()) {
                // si el metodo devuelve false escribo en el archivo de errores
                try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileErrores, true))) {
                    bw.write("B/C " + linea + "\n");
                } catch (IOException e) {
                    // si falla la escritura en el archivo de errores capturo el error
                    System.out.println("Error al escribir en el archivo de errores " + e.getMessage() + "\n");
                }
            }
        }
    }
}
