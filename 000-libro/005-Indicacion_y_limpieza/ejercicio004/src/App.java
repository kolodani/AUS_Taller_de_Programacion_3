/*
 *  Ejercicio 04:
 *  Añada un constructor sobrecargado al ejercicio anterior que admita un argumento de tipo String e imprima la
 *  correspondiente cadena de caracteres junto con el mensaje.
*/

class Ejemplo{
    Ejemplo(){
        System.out.println("Objeto creado");
    }
    Ejemplo(String i){
        System.out.println("Objeto creado: " + i);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Ejemplo ryu = new Ejemplo();
        Ejemplo ken = new Ejemplo("ken");
    }
}
