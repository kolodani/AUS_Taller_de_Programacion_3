import java.io.File;
import java.io.IOException;

public class ReadFile {
    // variables para guardar la ruta y el nombre del archivo
    private File path;
    private File nameFile;

    // constructor que recibe la ruta del archivo
    public ReadFile(String file_path) {
        // asigno la ruta completa a la variable path
        path = new File(file_path);
        // separo la ruta por el caracter / y guardo el ultimo elemento en la variable nameFile
        String [] parts = file_path.split("/");
        nameFile = new File(parts[parts.length-1]);
    }

    // metodo para saber si existe el directorio, devuelve un booleano
    public boolean existeDirectorio() {
        if (path.exists()) {
            return true;
        } else {
            return false;
        }
    }

    // metodo para obtener la ruta del archivo
    public File getPath() {
        return path;
    }

    // metodo principal de la aplicacion
    // metodo sincronizado para que no se ejecute al mismo tiempo en varios hilos
    public synchronized boolean aplicarAccion() {
        // si existe el directorio borro el archivo
        if (existeDirectorio()) {
            path.delete();
            return true;
        } else {
            // si no existe el directorio lo creo
            try {
                path.createNewFile();
                return true;
            } catch (IOException e) {
                // la creacion del archivo puede fallar por permisos o por que no existe la ruta, capturo el error
                System.out.println("Error al crear el archivo: " + nameFile + " " + e.getMessage() + "\n");
                return false;
            }
        }
    }
}
