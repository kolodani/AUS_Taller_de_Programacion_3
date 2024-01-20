package Ejemplo;

import java.io.File;
import java.nio.file.Files;

public class EjemploFile {

    public static void main(String[] args) {

        File f1 = new File("Archivo.txt");
        try {
            Files.delete(f1.toPath());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// cuando quiera borrar un archivo, lo que tengo que hacer es crear un objeto de tipo File
// y usando la clase Files, llamo al metodo delete, y le paso como parametro el path del archivo
// que quiero borrar, y listo, se borra el archivo.
// ya que si no uso Files, puede o no funcionar el metodo delete, ya que no es seguro.