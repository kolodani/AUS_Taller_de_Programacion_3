package Ejemplos;

import java.io.FileReader;

public class Captura02 {

    public static void main(String[] args){
        try {
            FileReader fr = new FileReader("daniel.txt");
            Class.forName("java.lang.String");
        // } catch (IOException | ClassNotFoundException e) {
        //     e.printStackTrace();
        // }
        } catch (Exception e) {
            e.printStackTrace();
            // encuentro una clase que englobe a IOException y ClassNotFoundException pero
            // al usar Exception capturo cualquier otro tipo de Excepcion que hereda de ella
        }
    }
}
