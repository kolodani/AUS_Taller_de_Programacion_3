public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Calculo de velociadad");
        double distancia, tiempo, velociadad;
        distancia = 20.0;
        tiempo = 1.45;
        System.out.println("El corredor corrio una distancia de: " + distancia);
        System.out.println("En un tiempo de: " + tiempo);
        velociadad = distancia / tiempo;
        System.out.println("A una velocidad de: " + velociadad);
    }
}
