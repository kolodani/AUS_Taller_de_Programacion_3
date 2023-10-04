public class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared() {
        System.out.println("Creating " + this);
    }
    public void addRef(){
        refcount++;
    }
    protected void dispose() {
        if(--refcount == 0){
            System.out.println("Disposing " + this);
        }
    }
    protected void finalize() {
        if(refcount != 0){
            System.out.println("Error: objeto no listo para desechar");
        }
    }
    public String toString() {
        return "Shared " + id;
    }
}
