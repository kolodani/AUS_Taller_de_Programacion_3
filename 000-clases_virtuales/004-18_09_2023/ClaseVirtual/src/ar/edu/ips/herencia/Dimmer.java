package ar.edu.ips.herencia;

public class Dimmer extends Lampara{

    public static final int MAX = 100;
    private int intensidad;
    private int max;

    public Dimmer() {
        this(false, MAX);
    }

    public Dimmer(boolean prendida, int max){
        super(prendida);
        if (max > MAX){
            max = MAX;
        }
        this.max = max;
    }

    public void inc() {
        if (intensidad == 0){
            super.on();
        }
        if( intensidad != max){
            intensidad++;
        }
    }

    public void dec() {
        intensidad--;
    }

    public int getIntensidad() {
        return intensidad;
    }

    @Override
    public void on() {
        inc();
    }
}
