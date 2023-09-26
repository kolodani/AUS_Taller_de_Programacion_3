class Woodwind extends Instrument {
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }
    public String toString() {
        return "Woodwind";
    }
}
