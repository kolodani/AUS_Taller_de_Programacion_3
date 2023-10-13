import java.io.File;

public static void main(String[] args) {
    public static void main(String[] args) {
        String dirName = args[0];
        String fileName = args[1];
        fileName(dirName,fileName);
    }

    public static void findFile(String root, String fileName){
        File dir = new File(root);
        File[] fileList = dir.listFiles();
        System.out.println(root);
        if(dir.getName().equals(fileName)) {
            System.out.println(fileName);
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
