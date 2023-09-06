package Mazo;

public class Carta {
    private Palo palo;
    private Numero numero;

    Carta(Palo palo, Numero numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public String toString() {
        return numero + " de " + palo;
    }

    public int hashCode() {
        return palo.hashCode() + numero.hashCode();
    }

    public boolean equals(Object otra) {
        if(otra == null) {
            return false;
        }
        if(otra == this) {
            return true;
        }
        if(otra instanceof Carta) {
            Carta tmp = (Carta) otra;
            return palo.equals(tmp.palo) && numero.equals(tmp.numero);
        }
        return false;
    }
}
