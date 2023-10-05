import java.io.*;

public class Ejemplo02 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("entrada2.bin");
            FileOutputStream fos = new FileOutputStream("salida.bin");
            int c;
            byte[] buff = new byte[8192];
            long start = System.currentTimeMillis();
            while ((c = fis.read(buff)) != -1) {
                fos.write(buff, 0, c);
            }
            long end = System.currentTimeMillis();
            System.out.println("Tiempo: " + (end - start));
            fos.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
