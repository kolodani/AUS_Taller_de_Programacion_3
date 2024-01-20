package AlgoDeHilos;

public class PilaDemo {

    public static void main(String[] args) {

        Pila p = new Pila();

        p.push('a');
        p.push('b');
        p.push('c');

        System.out.println("Tamaño de la pila: " + p.size());

        System.out.println("Pop: " + p.pop());
        System.out.println("Pop: " + p.pop());
        System.out.println("Pop: " + p.pop());
    }
}
