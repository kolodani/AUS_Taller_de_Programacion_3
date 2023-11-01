import java.net.*;
import java.io.*;

public class Sockete {
    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(4567)) {
            while (true) {
                Socket s = ss.accept();
                InputStream is = s.getInputStream();
                OutputStream os = s.getOutputStream();
                os.write("AHHHHHHHHHHHH".getBytes());
                s.close();
            }
        } catch (IOException e) {
            System.err.println("JOE mama");
        }
    }
}
