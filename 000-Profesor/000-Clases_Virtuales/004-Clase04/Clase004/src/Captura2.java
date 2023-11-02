import java.io.FileReader;
//import java.io.IOException;

public class Captura2 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("daniel.txt");
            Class.forName("java.lang.String");
        // } catch (IOException | ClassNotFoundException e) {
        //     e.printStackTrace();
        // }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
