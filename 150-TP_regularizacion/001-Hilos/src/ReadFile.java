import java.io.File;
import java.io.IOException;

public class ReadFile {
    private File path;
    private File nameFile;

    public ReadFile(String file_path) {
        path = new File(file_path);
        String [] parts = file_path.split("/");
        nameFile = new File(parts[parts.length-1]);
    }

    public boolean existeDirectorio() {
        if (path.exists()) {
            return true;
        } else {
            return false;
        }
    }

    public File getPath() {
        return path;
    }

    public boolean aplicarAccion() {
        if (existeDirectorio()) {
            path.delete();
            return true;
        } else {
            try {
                path.createNewFile();
                return true;
            } catch (IOException e) {
                System.out.println("Error al crear el archivo: " + nameFile);
                return false;
            }
        }
    }

}
