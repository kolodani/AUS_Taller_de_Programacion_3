import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo01 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            String line;
            while((line = br.readLine()) != null) {
                if(line.contains("65"))
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
