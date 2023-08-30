/*
 *  Ejercicio 21:
 *  Cree un tipo enum con los seis lipos de billetes de euro de menor valor. Recorra en bucle los valores utilizando
 *  values() e imprima cada valor y su orden correspondiente con ordinal().
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Lista de billetes en EURO");
        for (Billetes billete : Billetes.values()) {
            System.out.println((billete.ordinal() + 1) + ") " + billete);
        }
    }
}
