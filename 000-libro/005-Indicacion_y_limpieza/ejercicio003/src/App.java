/*
 *  Ejercicio 03:
 *  Cree una clase con un constructor predeterminado (uno que no tome ningún argumento) que imprima un mensaje. Cree
 *  Un objeto de esa clase.
*/

class Ejemplo{
    Ejemplo(){
        System.out.println("Objeto creado");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Ejemplo ryu = new Ejemplo();
    }
}
