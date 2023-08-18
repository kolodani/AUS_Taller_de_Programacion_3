/*
 *  Ejercicio 5:
 *  Modifique el ejercicio anterior de modo que los va lores de los datos en DataOnly se asignen e
 *  impriman en main().
*/
public class App {
    public static void main(String[] args) throws Exception {
        DataOnly daOn = new DataOnly();
        daOn.i = 666;
        daOn.d = 5.5;
        daOn.b = true;

        System.out.println(daOn.i);
        System.out.println(daOn.d);
        System.out.println(daOn.b);
    }
}
