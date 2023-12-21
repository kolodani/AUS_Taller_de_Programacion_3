import Recursos.Carta;
import Recursos.Mazo;

public class Juego {
    public static void main(String[] args) {
        Mazo m = new Mazo();
        for (int i = 0; i < 2; i++) {
            Carta c1 = m.getCarta();
            if (c1 != null){
                // automaticamente como quiero mostrar un objeto, llama al metodo toString()
                System.out.println(c1);
            }
        }
        Carta c1 = m.getCarta();
        Carta c2 = m.getCarta();

        System.out.println(c1.equals(c2));

        String s1 = "Hola";
        String s2 = "Chau";
        System.out.println(s1.equals(s2));
    }
}
