public class Music {
    // No me preocupa el tipo, po lo que los nuevos tipos
    // añadidos al sistema seguiran funcionando:
    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }
    public static void main(String[] args) {
        // Generalizacion durante la insercion en la matriz
        Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()
        };
        tuneAll(orchestra);
    }
}
