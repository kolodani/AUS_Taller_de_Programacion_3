package AlgoDeHilos;

public class Productor implements Runnable {

    private Pila pila;

    public Productor(Pila pila) {
        this.pila = pila;
    }

    @Override
    public void run() {
        for (int i = 0; i < 750; i++) {
            char azar = ((char) ((int) (Math.random() * 26 + 'A')));
            pila.push(azar);
        }
    }
}
