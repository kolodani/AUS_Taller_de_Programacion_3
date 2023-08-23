/*
 *  Ejercicio 01:
 *  Cree una clase que contenga una referencia de tipo String no inicializada. Demuestre que esta referencia la
 *  inicializa Java con el valor null.
*/

class Ejemplo{
    String variable;
    Ejemplo(){
        System.out.println("Objeto creado");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Ejemplo nano = new Ejemplo();
        System.out.println(nano.variable);
    }
}
