import java.io.File;

public class FileFind {
    public static void main(String[] args) {
        findFile(args[0],args[1]);
    }
    public static void findFile(String root, String fileName){
        File dir = new File(root);
        File[] fileList = dir.listFiles();
        if(dir.getName().equals(fileName)) {
            System.out.println(fileName);
            System.out.println(dir.getAbsolutePath());
            System.out.println("Found!");
            return;
        }
        if(fileList == null) {
            return;
        }
        for(File f : fileList){
            findFile(f.getAbsolutePath(),fileName);
        }
    }
}
