package Recursos;

public class Carta {
    private Palo palo;

    private Numero numero;

    Carta(Palo palo, Numero numero) {
        this.palo = palo;
        this.numero = numero;
    }

    // sobre escribo el metodo toString() para que pueda mostrar carta
    // el override me garantiza que si cambio la firma, me da error
    @Override
    public String toString() {
        return numero + " de " + palo;
    }

    @Override
    public boolean equals(Object c) {
        if (c == null) {
            return false;
        }
        if (c == this) {
            return true;
        }
        if (c instanceof Carta) {
            Carta tmp = (Carta) c;
            return (this.palo.equals(tmp.palo) && this.numero.equals(tmp.numero));
        }
        return false;
    }
}
