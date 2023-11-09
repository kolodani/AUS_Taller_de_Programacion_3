import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Hilo extends Thread{
    private String[] linea;
    private File fileErrores;
    private ReadFile readFile;

    public Hilo(String[] linea, File fileErrores) {
        this.linea = linea;
        this.fileErrores = fileErrores;
    }

    public void run() {
        for (int i = 0; i < linea.length; i++) {
            if (linea[i] != null) {
                readFile = new ReadFile(linea[i]);
            }
            if (!readFile.aplicarAccion()) {
                try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileErrores, true))) {
                    bw.write("B/C " + linea + "\n");
                } catch (IOException e) {
                    System.out.println("Error al escribir en el archivo de errores");
                }
            }
        }
    }
}
