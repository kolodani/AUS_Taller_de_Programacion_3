public class LanzarDado implements Lanzar {
    private int eventos = 1;
    public static final int EVENTOS = 6;
    public boolean evento() {
        System.out.println("Lanzar un dado " + eventos);
        return ++eventos <= EVENTOS;
    }
}
