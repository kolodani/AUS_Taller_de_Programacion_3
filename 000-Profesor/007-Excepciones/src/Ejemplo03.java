import java.io.*;
import java.nio.Buffer;

public class Ejemplo03 {
    public static void main(String[] args) {
        BufferedInputStream bi = null;
        BufferedOutputStream bo = null;
        try {
            bi = new BufferedInputStream(new FileInputStream("entrada2.bin"), 16384);
            bo = new BufferedOutputStream(new FileOutputStream("salida.bin"), 8192);
            int c;
            long start = System.currentTimeMillis();
            while ((c = bi.read()) != -1) {
                bo.write(c);
            }
            long end = System.currentTimeMillis();
            System.out.println("Tiempo: " + (end - start));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bo != null) {
                    bo.close();
                }
                if (bi != null) {
                    bi.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
