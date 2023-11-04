import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo05 {
    public static void main(String[] args) {
        MisDatos md = new MisDatos(123456789, false, 5.5, "Grover", (short) 35, "Secreto666");
        MisDatos.setVALOR("TheKing");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("datos2.bin"))) {
            oos.writeObject(md);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
