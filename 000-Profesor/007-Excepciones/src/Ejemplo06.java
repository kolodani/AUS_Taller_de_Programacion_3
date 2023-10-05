import java.io.*;
import java.nio.Buffer;

public class Ejemplo06 {
    public static void main(String[] args) {
        try (BufferedReader bi = new BufferedReader(new FileReader("Ejemplo06.java"))) {
                String c;
                int i = 1;
                while ((c = bi.readLine()) != null) {
                    System.out.println(i + " " + c);
                    i++;
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
