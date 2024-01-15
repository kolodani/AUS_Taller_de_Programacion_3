import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ejemplo05 {

    public static void main(String[] args) {
        MisDatos ms = new MisDatos(120000000, true, 5.5, "Grover", (short)32, "secret123456");
        MisDatos.setVALOR("VALOR");
        try (ObjectOutputStream br = new ObjectOutputStream(new FileOutputStream("data3.bin"))){
            br.writeObject(ms);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
