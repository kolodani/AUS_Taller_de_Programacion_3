/*
 *  Ejercicio 03:
 *  Añada un nuevo método a la clase base de Shapes.java que imprima un mensaje,
 *  pero sin sustituirlo en las clases derivadas. Explique lo que sucede. Ahora,
 *  sustitúyalo en una de las clases derivadas pero no en las otras y vea lo que
 *  sucede. Finalmente, sustitúyalo en todas las clases derivadas.
*/

public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        // Rellena la matriz con formas:
        for(int i = 0; i < s.length; i++)
            s[i] = gen.next();
        // Realiza llamadas a metodos polimorficos:
        for(Shape shp : s)
            shp.draw();
    }
}
