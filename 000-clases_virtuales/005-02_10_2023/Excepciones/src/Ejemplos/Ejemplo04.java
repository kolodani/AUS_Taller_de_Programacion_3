package Ejemplos;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class Ejemplo04 {

    public static void main(String[] args){
        // tira error porque hay una excepcion no manejada, puede que se de el error o no
        // para evitar esto usamos un try_catch
        try {
            FileReader fr = new FileReader("Daniel.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
