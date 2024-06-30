import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;

public class Archivo {
    public int escribirArchivo(String resultado, int cantidad) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("./resources/respuestas.bin", true))) {
            bw.write(resultado + "\n");
            cantidad++;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cantidad;
    }
    public ArrayList<String> leerArchivo(){
        ArrayList<String> linea = new ArrayList<>();
        try (BufferedReader br = new BufferedReader( new FileReader("./resources/respuestas.bin"))){
            String line;
            while ((line = br.readLine()) != null ) {
                linea.add(line);
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
