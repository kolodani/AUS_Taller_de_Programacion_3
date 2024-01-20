package Formas;

public class Triangulo extends FiguraGeometrica {

    private int altura;

    public Triangulo(int altura) {
        this.altura = altura;
    }

    @Override
    public double perimetro() {
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }

    public int getAltura() {
        return altura;
    }
}
