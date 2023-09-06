/*
 *  Ejercicio 09:
 *  Cree una clase denominada Root que contenga una instancia de cada una de las siguientes clases (que también deberá
 *  crear): Component1, Component2 y Component3. Derive una clase Stem de Root que también contenga una instancia de
 *  cada "componente", Todas las clases deben tener constructores predeterminados que impriman un mensaje relativo a la
 *  clase.
*/

public class Stem extends Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();
    public Stem(){
        System.out.println("STEM");
    }
    public static void main(String[] args) {
        new Stem();
    }
}
