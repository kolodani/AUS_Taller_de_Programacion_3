/*
 *  Ejercicio 15:
 *  Cree una clase con un campo String que se inicialice mediante una cláusula de inicialización de instancia.
*/

public class App {
    String palabra;
    {
        palabra = "Grover the Best";
    }
    App(){
        System.out.println("Constructor por defecto: " + palabra);
    }
    App(int i){
        System.out.println("Constructor entero: " + i + " " + palabra);
    }
    public static void main(String[] args) throws Exception {
        new App();
        new App(666);

    }
}
