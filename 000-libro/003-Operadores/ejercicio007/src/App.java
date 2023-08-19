/*
 *  Ejercicio 07:
 *  Escriba un programa que simule el proceso de lanzar una moneda al aire
*/

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        double r = rand.nextDouble(1);
        Coin moneda = new Coin();
        moneda.lanzar(r);
        if(moneda.caraMonada){
            System.out.println("Cara");
        } else {
            System.out.println("Cruz");
        }
    }
}
