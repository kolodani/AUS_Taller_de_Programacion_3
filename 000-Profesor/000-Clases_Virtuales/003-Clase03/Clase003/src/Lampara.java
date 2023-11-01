public class Lampara {
    private boolean apagada;

    public Lampara() {
        this.apagada = true;
    }

    public Lampara(boolean prendida){
        apagada = !prendida;
    }

    public void on() {
        this.apagada = false;
    }

    public void off() {
        this.apagada = true;
    }

    public boolean isPrendida() {
        return !this.apagada;
    }

    @Override
    public String toString() {
        return "La lampara esta " + (apagada ? "apagada" : "prendida");
    }
}
