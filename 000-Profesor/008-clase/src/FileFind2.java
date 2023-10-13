import java.io.*;

public class FileFind2 {
    private File path;
    private File name;

    public FileFind2(String p, String n) {
        path = new File(p);
        name = new File(n);
    }

    public boolean esUnDirectorio(File f) {
        if (f.isDirectory()) {
            System.out.println("Directorio encontrado");
            return true;
        } else {
            System.out.println("Directorio no encontrado o inexistente");
            return false;
        }
    }

    public boolean esUnArchivo(File f) {
        if (f.isFile()) {
            System.out.println("Archivo encontrado");
            return true;
        } else {
            System.out.println("Archivo no encontrado o inexistente");
            return false;
        }
    }

    public static void main(String[] args) {
        FileFind2 archivito = new FileFind2(args[0], args[1]);
        if (archivito.esUnDirectorio(archivito.path)) {
            if (archivito.esUnArchivo(archivito.name)) {
                System.out.println("El archivo: " + archivito.name);
                System.out.println("se encuentra en el path: " + archivito.path);
            }
        }
    }
}
