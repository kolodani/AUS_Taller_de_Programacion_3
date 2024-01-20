package Formas;

public class Cuadrado extends FiguraGeometrica{

    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public double perimetro() {
        return lado * 4;
    }

    public double area() {
        return lado * lado;
    }

    public int getLado() {
        return lado;
    }
}
