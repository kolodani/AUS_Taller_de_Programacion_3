import Cartas.Carta;
import Cartas.Mazo;

public class Juego {
    public static void main(String[] args) {
        Mazo m = new Mazo();
        for (int i = 0; i < 10; i++) {
            Carta c1 = m.getAlAzar();
            if (c1 != null) {
                System.out.println(c1);
            }
        }
        Carta c2 = m.getAlAzar();
        Carta c3 = m.getAlAzar();

        System.out.println(c3.equals(c2));
    }
}
