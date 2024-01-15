package Ejemplos;

public class NoHayMasCartas {

    public static void main(String[] args) {
        boolean noHayMasCartas = true;
        if (noHayMasCartas) {
            NoHayMasCartasException nhmce = new NoHayMasCartasException();
            try {
                throw nhmce;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
