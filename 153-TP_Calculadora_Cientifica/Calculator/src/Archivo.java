import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;

public class Archivo {
    public void escribirArchivo(String resultado) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("./resources/respuestas.bin", true))) {
            bw.write(resultado + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String leerArchivo(){
        String linea = "";
        try (BufferedReader br = new BufferedReader( new FileReader("./resources/respuestas.bin"))){
            String line;
            while ((line = br.readLine()) != null ) {
                linea = line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linea;
    }
    public void borrarArchivo(){
        File basura = new File("./resources/respuestas.bin");
        basura.delete();
    }
}
