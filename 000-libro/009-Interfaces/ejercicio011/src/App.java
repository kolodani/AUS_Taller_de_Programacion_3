/*
 *  Ejercici0 11:
 *  Cree una clase con un método que tome como argumento un objeto String y produzca un resultado en
 *  el que se intercambie cada pareja de caracteres contenida en el argumento. Adapte la clase para
 *  que funcione con interfaceprocessor.Apply.process().
*/

public class App {
    public static void main(String[] args) {
        Apply.process(new SwapperAdapter(), "1234");
        Apply.process(new SwapperAdapter(), "abcde");
    }
}
