import java.io.Serializable;

public class Circulo extends FiguraGeometrica implements Serializable {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }
}
