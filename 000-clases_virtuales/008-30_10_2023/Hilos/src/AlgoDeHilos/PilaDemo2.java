package AlgoDeHilos;

public class PilaDemo2 {

    public static void main(String[] args) {

        Pila p = new Pila();

        Productor p1 = new Productor(p);
        Productor p2 = new Productor(p);

        Consumidor c1 = new Consumidor(p);
        Consumidor c2 = new Consumidor(p);
        Consumidor c3 = new Consumidor(p);

        Thread [] threads = new Thread[5];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread();
        }

        threads[0] = new Thread(p1, "p1");
        threads[1] = new Thread(p2, "p2");
        threads[2] = new Thread(c1, "c1");
        threads[3] = new Thread(c2, "c2");
        threads[4] = new Thread(c3, "c3");

        for (Thread t : threads) {
            t.start();
        }

        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        System.out.println("Tamaño de la pila: " + p.size());
    }

}
