import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo03 {
    public static void main(String[] args) {
        try (DataOutputStream br = new DataOutputStream(new FileOutputStream("data.bin"))) {
            br.writeInt(120000000);
            br.writeBoolean(true);
            br.writeDouble(5.5);
            br.writeUTF("Grover");
            br.writeShort(33);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
