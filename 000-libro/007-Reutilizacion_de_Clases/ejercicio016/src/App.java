/*
 *  Ejercicio 16:
 *  Cree una clase denominada Amphibian (anfibio). A partir de ésta, defina una nueva clase denominada Frog (rana) que
 *  herede de la anterior. Incluya una seríe de métodos apropiados en la clase base. En main(). cree un objeto Frog y
 *  realice una generalización a Amphibian, demostrando que lodos los métodos siguen funcionando.
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
