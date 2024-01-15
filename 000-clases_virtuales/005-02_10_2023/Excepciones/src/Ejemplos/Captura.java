package Ejemplos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Captura {

    public static void main(String[] args){
        try {
            FileReader fr = new FileReader("daniel.txt");
            fr.read();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
