public class Tank {
    static int contador = 0;
    int id = contador++;
    boolean lleno;
    Tank(){
        lleno = true;
        System.out.println("Tanque numero: " + id + " Creado");
    }
    public void vacio(){
        lleno = false;
    }
    protected void finalize(){
        if (lleno) {
            System.out.println("ERROR: no se puede eliminar el tanque " + id + " pporque esta lleno");
        }
        else{
            System.out.println("Tanque " + id + " eliminado");
        }
    }
}
