//: object/HelloDate.java
import java.util.*;

/** El primer programa de ejemplo del libro.
 *  Muestra una cadena de caracteres y la fecha actual.
 *  @author Bruce Eckel
 *  @author www.MindView.net
 *  @version 4.0
*/

public class HelloDate {
    /** Punto de entrada a la clase y a la aplicacion.
     * @param args matriz de argumentos de cadena
     * @throws exceptions No se generan excepciones
    */
    public static void main(String[] args) {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
    }
}
