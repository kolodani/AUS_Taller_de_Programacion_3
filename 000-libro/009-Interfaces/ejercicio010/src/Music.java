/*
 *  Ejercicio 10:
 *  Modifique Music5.java añadiendo una interfaz Playable. Mueva la declaración de play() de
 *  Instrument a Playable. Añada Playable a las clases derivadas incluyéndola en la lista implements.
 *  Modifique tune() de modo que acepte un objeto Playable en lugar de un objeto Instrument.
*/

public class Music {
    static void tune(Playable p) {
        p.play(Note.MIDDLE_C);
    }
    static void tuneAll(Playable[] e) {
        for(Playable p : e)
            tune(p);
    }
    public static void main(String[] args) {
        Playable[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()
        };
        tuneAll(orchestra);
    }
}
