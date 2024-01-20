package AlgoDeHilos;

public class Consumidor implements Runnable{

    private Pila pila;

    public Consumidor(Pila pila) {
        this.pila = pila;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            pila.pop();
        }
    }
}
