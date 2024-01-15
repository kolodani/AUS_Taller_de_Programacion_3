package Ejemplos;

public class Ejemplo01 {

    public static void main(String[] args){

        int j = 1;
        int i = 0;
        try {
            System.out.println(j / i);
        } catch (ArithmeticException e) {
            // nunca dejar un catch vacio
            System.out.println(e);
        }
        System.out.println("Todo OK");
    }
}
