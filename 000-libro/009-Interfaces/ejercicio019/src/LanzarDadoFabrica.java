public class LanzarDadoFabrica implements LanzarFabrica{
    public LanzarDado getLanzar() {
        return new LanzarDado();
    }
}
