/*
 *  Ejercicio 24:
 *  En Beetle.java, defina una nueva clase que represente un tipo específico de
 *  la clase Beetle de la que debe heredar, siguiendo el mismo formato que las
 *  clases existentes. Trace y explique los resultados de salida.
*/

public class App extends Beetle{
    int m = printInit("App.m initialized");
    public App() {
        j = 66;
        System.out.println("m = " + m);
        System.out.println("j = " + j);
    }
    static int x3 = printInit("static App.x3 initialized");
    public static void main(String[] args) {
        System.out.println("App constructor");
        App app = new App();
    }
}
