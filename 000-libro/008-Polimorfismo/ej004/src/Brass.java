class Brass extends Instrument {
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }
    void adjust() {
        System.out.println("Adjusting Brass");
    }
}
