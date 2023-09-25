// Los Objetos Wind son instrumentos
// porque tienen la misma interfaz:

public class Wind extends Instrument {
    // redefinicion de un metodo de la interfaz:
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}
