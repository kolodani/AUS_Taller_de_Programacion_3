/*
 *  Ejercicio 03:
 *  Cree dos paquetes: debug y debugoff, que contengan una clase idéntica con un método debug(). La primera versión
 *  debe mostrar su argumento String en la consola, mientras que la segunda no debe hacer nada. Utilice una línea
 *  static import para importar la clase en un programa de prueba y demuestre el efecto de la compilación condicional.
*/

import access.debugoff.Debug.*;

public class App {
    public static void main(String[] args) throws Exception {
        Debug("RELEASE VERSION");
    }
}
