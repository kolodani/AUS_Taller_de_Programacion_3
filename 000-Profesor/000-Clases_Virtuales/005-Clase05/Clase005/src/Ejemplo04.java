import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ejemplo04 {
    public static void main(String[] args) {
        try (DataInputStream br = new DataInputStream(new FileInputStream("data.bin"))) {
            System.out.println(br.readInt());
            System.out.println(br.readBoolean());
            System.out.println(br.readDouble());
            System.out.println(br.readUTF());
            System.out.println(br.readShort());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
