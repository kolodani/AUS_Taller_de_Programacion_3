public class Electronic extends Instrument {
    void play(Note n) {
        System.out.println("Electronic.play() " + n);
    }
    void adjust() {
        System.out.println("Adjusting Electronic");
    }
    public String toString() {
        return "Electronic";
    }
}
