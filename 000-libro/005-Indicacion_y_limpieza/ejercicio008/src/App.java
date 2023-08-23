/*
 *  Ejercicio 08:
 *  Cree una clase con dos metodos. Dentro del primer método invoque al segundo método dos veces: la primera vez sin
 *  utitizar this y la segunda utilizando dicha palabra clave. Realice este ejemplo simplemente para ver cómo funciona
 *  el mecanismo. no debe utilizar esta forma de invocar a los métodos en la práctica.
*/

class Personaje{
    public void moverse(){
        System.out.println("El personaje se mueve");
    }
    public void correr(){
        moverse();
        this.moverse();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Personaje mario = new Personaje();
        mario.moverse();
        mario.correr();
    }
}
