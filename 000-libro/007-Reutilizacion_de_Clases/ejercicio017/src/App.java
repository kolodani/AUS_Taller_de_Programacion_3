/*
 *  Ejercicio 17:
 *  Modifique el Ejercicio 16 para que el objeto Frog sustituya las definiciones de métodos de la clase base
 *  (proporcione las nuevas definiciones utilizando las mismas signaturas de métodos). Observe 10 que sucede en main( ).
*/

public class App {
    public static void main(String[] args) throws Exception {
        Anfibio rene = new Rana();
        rene.setEspecie("Rana");
        rene.correr(rene.getEspecie());
        rene.nadar(rene.getEspecie());
        System.out.println("El animal es una: " + rene.getEspecie());
    }
}
