/*
 *  Ejercicio 06:
 *  Utilizando Chess.java. demuestre las afimlaciones del párrafo anterior.
*/

//? este es el mesaje que recibimos si no tenemos dentro de la clase Chess el super() en el constructor
//! Implicit super constructor BoardGame() is undefined. Must explicitly invoke another constructor

class Game{
    Game(int i){
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game{
    BoardGame(int i){
        super(i);
        System.out.println("BoardGame constructor");
    }
}

public class Chess extends BoardGame{
    Chess(){
        super(11);
        System.out.println("Chess constructor");
    }
    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
