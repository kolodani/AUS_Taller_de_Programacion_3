import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Ejemplo06 {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("datos2.bin"))) {
            MisDatos md2 = (MisDatos) ois.readObject();
            System.out.println(md2.getD());
            System.out.println(md2.getI());
            System.out.println(md2.getS());
            System.out.println(md2.getSh());
            System.out.println(md2.getB());
            System.out.println(md2.getClave());
            System.out.println(MisDatos.getVALOR());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
