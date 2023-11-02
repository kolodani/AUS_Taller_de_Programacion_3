import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejemplo04 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("daniel.txt");
        } catch (FileNotFoundException e){
            System.err.println(e);
        }
    }
}
