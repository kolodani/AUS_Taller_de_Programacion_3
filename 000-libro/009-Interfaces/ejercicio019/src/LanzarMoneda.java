public class LanzarMoneda implements Lanzar {
    private int eventos = 1;
    public static final int EVENTOS = 2;
    public boolean evento() {
        System.out.println("Lanzar una moneda " + eventos);
        return ++eventos <= EVENTOS;
    }
}
