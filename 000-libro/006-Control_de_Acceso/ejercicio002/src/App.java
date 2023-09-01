import java.util.Vector;

public class App {
    public static void main(String[] args) throws Exception {
        Vector v1 = new Vector(1, 2);
        java.util.Vector v2 = new java.util.Vector();
        // v1.mostrar();
        // al importar vector y llamar a mi clase de la misma manera, el compilador no sabe si me estoy refiriendo a mi
        // clase o a la clase importada, por lo que me da un error de ambiguedad
    }
}
