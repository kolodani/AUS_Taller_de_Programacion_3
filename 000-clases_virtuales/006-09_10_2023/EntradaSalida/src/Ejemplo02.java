import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo02 {

    public static void main(String[] args) {
        try (BufferedWriter br = new BufferedWriter( new FileWriter("data.bin"))){
            br.write("120000000");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
