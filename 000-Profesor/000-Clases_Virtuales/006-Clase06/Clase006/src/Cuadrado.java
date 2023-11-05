public class Cuadrado extends FiguraGeometrica {
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public double perimetro() {
        return 4 * lado;
    }

    public double area() {
        return lado * lado;
    }

    public int getLado() {
        return lado;
    }
}
