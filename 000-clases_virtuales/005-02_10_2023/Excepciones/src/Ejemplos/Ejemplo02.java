package Ejemplos;

public class Ejemplo02 {

    public static void main(String[] args) throws ArithmeticException {
        // no es correcto pasar las excepciones, conviene capturarlas y hacer algo
        int j = 1;
        int i = 0;
        System.out.println(j / i);
        System.out.println("Todo OK");
    }
}
