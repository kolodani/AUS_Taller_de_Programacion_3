public class Contador {
    public static int contadorEstatico = 0; // contadorEstatico es un campo que va a variar entre instancias
    private int id = contadorEstatico++;
    public int getId() {
        return id;
    }
}
