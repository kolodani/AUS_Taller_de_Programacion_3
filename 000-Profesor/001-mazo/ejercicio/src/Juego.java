import Mazo.*;

public class Juego {
    public static void main(String[] args) {
        Mazo mazo = new Mazo();
        // for (int i = 0; i < 48; i++) {
        //     System.out.print(i + 1 + ": ");
        //     System.out.println(mazo.getAlAzar());
        // }

        Carta c1 = mazo.getAlAzar();
        Carta c2 = mazo.getAlAzar();

        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
    }
}
