import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ejemplo06 {

    public static void main(String[] args) {
        try (ObjectInputStream br = new ObjectInputStream(new FileInputStream("data3.bin"))){
            MisDatos ms = (MisDatos) br.readObject();
            System.out.println(ms.getI());
            System.out.println(ms.isB());
            System.out.println(ms.getD());
            System.out.println(ms.getS());
            System.out.println(ms.getSh());
            System.out.println(ms.getClave());
            System.out.println(MisDatos.getVALOR());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
