public class BlankFinal {
    private final int i = 0; // Valor final inicializado
    private final int j; // Valor final en blanco
    private final Poppet p; // Referencia final en blanco
    // Los valores final en blanco DEBEN inicializarse en el constructor:
    public BlankFinal() {
        j = 1; // Inicialización final en blanco
        p = new Poppet(1); // Inicialización final en blanco
    }
    public BlankFinal(int x) {
        j = x; // Inicialización final en blanco
        p = new Poppet(x); // Inicialización final en blanco
    }
    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}
