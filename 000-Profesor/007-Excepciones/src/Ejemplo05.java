import java.io.*;
import java.nio.Buffer;

public class Ejemplo05 {
    public static void main(String[] args) {
        try (BufferedInputStream bi = new BufferedInputStream(new FileInputStream("entrada2.bin"));
                BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("salida.bin"))) {
                int c;
                long start = System.currentTimeMillis();
                while ((c = bi.read()) != -1) {
                    bo.write(c);
                }
                long end = System.currentTimeMillis();
                System.out.println("Tiempo: " + (end - start));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
