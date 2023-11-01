public class Dimmer extends Lampara{

    private int intensidad;
    private static final int MAX = 100;
    private int max;

    public Dimmer (){
        this(false, MAX);
    }

    public Dimmer (boolean prendida, int max) {
        super(prendida);
        if(max > MAX) {
            max = MAX;
        }
        this.max = max;
    }

    public void inc(){
        if (intensidad == 0){
            super.on();
        }
        if (intensidad != max){
            intensidad++;
        }
    }

    public void dec(){
        intensidad--;
    }

    public int getIntensidad(){
        return intensidad;
    }

    @Override
    public void on(){
        inc();
    }
}
