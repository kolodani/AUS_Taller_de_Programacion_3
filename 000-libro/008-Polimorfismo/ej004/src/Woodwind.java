class Woodwind extends Instrument {
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }
    String what() {
        return "Woodwind";
    }
}
