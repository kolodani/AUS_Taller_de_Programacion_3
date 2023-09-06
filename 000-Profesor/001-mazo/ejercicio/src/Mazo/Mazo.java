package Mazo;

public class Mazo {
    private Carta[] cartas;
    private int cant;

    public Mazo() {
        cant = 48;
        cartas = new Carta[cant];
        int indice = 0;
        for (Palo palo : Palo.values()) {
            for (Numero numero : Numero.values()) {
                cartas[indice++] = new Carta(palo, numero);
            }
        }
    }

    public Carta getAlAzar() {
        if (cant == 0) {
            return null;
        }
        int azar = (int) (Math.random() * cant--);
        Carta tmp = cartas[azar];
        cartas[azar] = cartas[cant];
        cartas[cant] = tmp;
        return cartas[cant];
    }
}
