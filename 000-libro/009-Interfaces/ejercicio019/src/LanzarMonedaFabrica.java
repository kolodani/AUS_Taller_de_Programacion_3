public class LanzarMonedaFabrica implements LanzarFabrica {
    public LanzarMoneda getLanzar() {
        return new LanzarMoneda();
    }
}
