public class ImprimirString {
    static void imprimir(String... strs){
        for (String palabra : strs) {
            System.out.println(palabra);
        }
    }
    public static void main(String[] args) {
        imprimir("Grover", "The", "Best");
        imprimir(new String[]{"Grover", "The", "Best"});
    }
}
