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
