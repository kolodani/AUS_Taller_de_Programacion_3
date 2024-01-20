package Formas;

public class Rectangulo extends Cuadrado {
    private int lado;

    public Rectangulo(int ladoA, int ladoB) {
        super(ladoA);
        this.lado = ladoB;
    }

    public double perimetro() {
        return (lado * 2) + (getLado() * 2);
    }

    public double area() {
        return lado * getLado();
    }
}
