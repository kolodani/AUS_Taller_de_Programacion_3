/*
 *  Ejercicio 22:
 *  Cree una clase final y trate de definir otra clase que herede de ella.
 */

public class App // extends Perro
{
    App(){
        //super();
        System.out.println("App perro creada");
    }
    public static void main(String[] args) throws Exception {
        App a = new App();
    }
}

/*
 *  Se genera un error porque no se puede heredar de una clase final
*/