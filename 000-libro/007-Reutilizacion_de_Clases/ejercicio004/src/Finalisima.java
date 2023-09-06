/*
 *  Ejercicio 04:
 *  Demuestre que los constructores de la clase base (a) se invocan siempre y (b) se invocan antes que los 
 *  constructores de la clase derivada.
*/

public class Finalisima extends Derivada {
    public Finalisima(){
        System.out.println("Clase Finalisima Construida");
    }
    public static void main(String[] args) {
        System.out.println("Constructor clase base");
        Base b = new Base();
        System.out.println("Constructor clase derivada");
        Derivada d = new Derivada();
        System.out.println("Constructor clase finalisima");
        Finalisima f = new Finalisima();
    }
}
