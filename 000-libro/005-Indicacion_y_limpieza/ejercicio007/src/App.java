/*
 *  Ejercicio 07:
 *  Cree una clase sin ningún constructor y luego cree un objeto de esa clase en main( ) para veriticar que se
 *  sintetiza automaticamente el constructor predeteminado.
*/

class Ejemplo{
    int variable;
}

public class App {
    public static void main(String[] args) throws Exception {
        Ejemplo sonic = new Ejemplo();
        System.out.println(sonic.variable);
    }
}
