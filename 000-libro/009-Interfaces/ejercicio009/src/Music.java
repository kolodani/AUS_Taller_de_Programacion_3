/*
 *  Ejercicio 09:
 *  Rediseñe Music5.java moviendo los métodos comunes de Wind, Percussion y Stringed a una clase abstracta.
*/

public class Music {
    static void tune(Instrument i) {
        i.adjust();
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    public static void main(String[] args) {
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
