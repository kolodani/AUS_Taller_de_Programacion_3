package AlgoDeHilos;

public class Pila {

    private static final int CANT = 10;
    private char[] elementos;
    private int index;

    public Pila() {
        elementos = new char[CANT];
    }

    public synchronized void push(char caracter) {
        while (index == CANT) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("(" + Thread.currentThread().getName() + "-----> " + caracter + " " + index);
        elementos[index++] = caracter;
        notifyAll();
    }

    public synchronized char pop() {
        while (index == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        char temp = elementos[--index];
        System.out.println("(" + Thread.currentThread().getName() + "<----- " + temp + " " + index);
        notifyAll();
        return temp;
    }

    public int size() {
        return index;
    }
}
