/*
 *  Ejercicio 19:
 *  Escriba un método que admita una matriz vararg de tipo String. Verifique que puede pasar una lista separada por
 *  comas de objetos String o una matriz String[] a este método.
*/

public class App {
    public static void main(String[] args) throws Exception {
        Ejemplo jorge = new Ejemplo();
        String[] a = {"4","5","6","7","8","9"};
        // creo una matriz y se la envio al metodo
        jorge.f(new String[]{"1","2","3"});
        // le envio la matriz creada
        jorge.f(a);
        // le envio varios string separados por coma
        jorge.f("10","11","12","13");
    }
}
