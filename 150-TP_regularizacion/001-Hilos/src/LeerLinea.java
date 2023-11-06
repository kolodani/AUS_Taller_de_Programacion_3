public class LeerLinea {
    private int contador;

    public synchronized void incrementar() {
        contador++;
    }

    public synchronized int getContador() {
        return contador;
    }
}
