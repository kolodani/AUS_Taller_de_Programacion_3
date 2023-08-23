/*
 *  Ejercicio 02:
 *  Cree una clase con un campo String que se inicialice en el punto donde se defina, y otro campo quesea inicializado
 *  por el constructor. ¿Cuál es la diferencia entre las dos técnicas?
*/

class Ejemplo{
    String variable = "Daniel";
    Ejemplo(String a){
        variable = a;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Ejemplo titi = new Ejemplo("Grover");
        System.out.println(titi.variable);
    }
}
