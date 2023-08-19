/*
 *  Ejercicio 8
 *  Escriba un programa que demuestre que, independientemente de cuántos objetos se creen de una
 *  clase concreta, só lo hay Ulla única instanc ia de un ca mpo static concreto defmido dentro de
 *  esa clase.
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Estatico.momo);
        Estatico e1 = new Estatico();
        Estatico e2 = new Estatico();
        System.out.println(e1.getMomo());
        System.out.println(e2.getMomo());
        Incremento.upa();
        System.out.println(e1.getMomo());
        System.out.println(e2.getMomo());
    }
}
