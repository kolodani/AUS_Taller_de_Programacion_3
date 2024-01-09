// la clase es publica y comienza siempre su nombre en mayusculas
public class Forma01 {
    // Inicializacion en la declaracion
    // campo privado
    private int i = 1;

    // metodo publico para devolver el valor de i
    public int getI() {
        return i;
    }

    public static void main(String[] args) {
        // creo el objeto con new
        Forma01 f1 = new Forma01();
        System.out.println(f1.getI());
    }
}
