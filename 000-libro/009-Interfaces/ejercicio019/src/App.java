/*
 *  Ejercicio 19:
 *  Cree un marco de trabajo utilizando métodos factoría que permita simular las operaciones de lanzar una moneda y
 *  lanzar un dado.
*/

public class App {
    public static void simular (LanzarFabrica fabrica) {
        Lanzar lanzar = fabrica.getLanzar();
        while (lanzar.evento()) {
            ;
        }
    }
    public static void main(String[] args) {
        simular(new LanzarMonedaFabrica());
        simular(new LanzarDadoFabrica());
    }
}
