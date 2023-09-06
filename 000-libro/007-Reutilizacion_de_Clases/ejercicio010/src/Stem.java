/*
 *  Ejercicio 10:
 *  Modifique el ejercicio anterior de modo que cada clase sólo tenga constructores no predetenninados.
*/

public class Stem extends Root {
    int i = 74;
    Component1 c1 = new Component1(i);
    Component2 c2 = new Component2(i);
    Component3 c3 = new Component3(i);
    public Stem(int j){
        super(j);
        System.out.println("STEM: " + j);
    }
    public static void main(String[] args) {
        new Stem(666);
    }
}
