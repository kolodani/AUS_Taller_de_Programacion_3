import java.io.*;
import java.net.*;

public class Cliente {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 4567);
            try {
                InputStream is = s.getInputStream();
                OutputStream os = s.getOutputStream();
                byte[] buff = new byte[256];
                is.read(buff);
                System.out.println(new String(buff));
            } catch (IOException e) {
                System.err.println(e);
            }
            s.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
