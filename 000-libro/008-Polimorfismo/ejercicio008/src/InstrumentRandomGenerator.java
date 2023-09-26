import java.util.Random;

public class InstrumentRandomGenerator {
    private Random rand = new Random(66);
    public Instrument next(){
        switch(rand.nextInt(6)){
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Brass();
            case 4: return new Woodwind();
            case 5: return new Electronic();
            default: return new Instrument();
        }
    }
}
