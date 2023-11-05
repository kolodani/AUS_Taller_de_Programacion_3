public class Rectangulo extends Cuadrado{
    private int lado;

    public Rectangulo(int ladoA, int ladoB) {
        super(ladoA);
        lado = ladoB;
    }

    public double perimetro() {
        return 2 * (lado + getLado());
    }

    public double area() {
        return lado * getLado();
    }
}
