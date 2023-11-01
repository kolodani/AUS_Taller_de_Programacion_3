package Cartas;

public class Carta {
    private Palo palo;
    private Numero numero;

    Carta(Palo palo, Numero numero) {
        this.palo = palo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }

    @Override
    public boolean equals(Object c){
        if (c == null){
            return false;
        }
        if (c == this){
            return true;
        }
        if (!(c instanceof Carta)){
            return false;
        }
        Carta tmp = (Carta) c;
        return this.palo == tmp.palo && this.numero == tmp.numero;
    }
}
