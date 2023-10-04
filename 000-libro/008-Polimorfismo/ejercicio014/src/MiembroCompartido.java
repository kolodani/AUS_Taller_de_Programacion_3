public class MiembroCompartido {
    private int contador;
    public void addRef(){
        System.out.println("Numero de referencia " + ++contador);
    }
    protected void dispose () {
        if (--contador == 0)
            System.out.println("Dispose() " + this);
    }
    public MiembroCompartido() {
        System.out.println("MiembroCompartido construido");
    }
    public String toString() {
        return "MiembroCompartido";
    }
}
