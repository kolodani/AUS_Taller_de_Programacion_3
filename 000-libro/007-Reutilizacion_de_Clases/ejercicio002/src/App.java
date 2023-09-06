/*
 *  Ejercicio 02:
 *  Cree una nueva clase que herede de la clase Detergent. Sustinlya el método scrub() y añada un nuevo método
 *  denominado sterilize().
*/

public class App extends Detergent {
    public void scrub(){
        append(" App.scrub()");
        super.scrub();
    }
    public void sterilize(){
        append(" sterilize()");
    }
    public static void main(String[] args) {
        App x = new App();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilize();
        System.out.println(x);
    }
}
