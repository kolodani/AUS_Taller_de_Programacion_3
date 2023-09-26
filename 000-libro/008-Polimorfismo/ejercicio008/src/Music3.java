/*
 *  Ejercicio 08:
 *  Modifique Music3.java para que genere aleatoriamente objetos instrument de la misma forma que lo
 *  hace Shapes.java.
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
    private static InstrumentRandomGenerator orquesta = new InstrumentRandomGenerator();
    public static void main(String[] args) {
        // Upcasting durante la adicion a la matriz:
        Instrument[] orchestra = new Instrument[30];
        for (int i = 0; i < orchestra.length; i++) {
            orchestra[i] = orquesta.next();
        }
        tuneAll(orchestra);
        printAll(orchestra);
    }
}