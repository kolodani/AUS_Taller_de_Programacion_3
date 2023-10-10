/*
 *  Ejercicio 06:
 *  Demuestre que lodos los métodos de una interfaz son automáticamente públicos.
*/

public class App implements UnaInterface {
    public void metodo1(int a, int b) {
        a = a + b;
        System.out.println("El resultado de la suma es: " + a);
    }
    public void metodo2(float c, float d) {
        c = c + d;
        System.out.println("El resultado de la suma es: " + c);
    }
    public static void main(String[] args) {
        App app = new App();
        app.metodo1(10, 22);
        app.metodo2(1.06f, 23.45f);
    }
}
