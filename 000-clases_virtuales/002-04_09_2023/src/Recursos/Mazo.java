package Recursos;

public class Mazo {
    private Carta[] cartas;
    private int cant;

    // es un constructor del mazo que crea las 48 cartas distintas al mazo
    public Mazo() {
        cant = 48;
        cartas = new Carta[cant];
        int indice = 0;
        for (Palo palo: Palo.values()) {
            for (Numero numero: Numero.values()) {
                cartas[indice++]= new Carta(palo, numero);
            }
        }
    }

    // saca una carta al azar hasta que el mazo no tiene cartas
    public Carta getCarta() {
        if (cant == 0){
            return null;
        }
        int azar = (int)(Math.random() * cant--);
        Carta tmp = cartas[azar];
        cartas[azar] = cartas[cant];
        cartas[cant] = tmp;
        return tmp;
    }
}
