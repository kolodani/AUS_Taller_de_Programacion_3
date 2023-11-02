import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Captura {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("daniel.txt");
            fr.read();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
