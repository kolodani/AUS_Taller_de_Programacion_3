package Formas;

public class FigurasDemo {

    public static void main(String[] args) {
        FIguraI [] figuras = new FIguraI[3];
        figuras[0] = new Cuadrado(2);
        figuras[1] = new Circulo(3);
        figuras[2] = new Triangulo(4);

        // Codigo polimorfico
        for (FIguraI figura : figuras) {
            System.out.println(figura.perimetro());
            System.out.println(figura.area());
        }
    }
}
