/*
 *  Ejercicio 07:
 *  Aniada un nuevo tipo de objeto instrument a Music3.java y verifique que el polimorfismo funciona
 *  para el nuevo tipo.
*/

public class Music3 {
    // No importa el tipo, por lo que los nuevos
    // tipos añadidos al sistema funcionan bien:
    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    public static void printAll(Instrument[] orchestra) {
        for(Instrument i: orchestra){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        // Upcasting durante la adicion a la matriz:
        Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind(),
            new Electronic(),
        };
        tuneAll(orchestra);
        printAll(orchestra);
    }
}