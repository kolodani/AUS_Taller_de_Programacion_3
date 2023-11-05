public class FigurasDemo {
    public static void main(String[] args) {
        FiguraI [] figuras = new FiguraI[3];
        figuras[0] = new Cuadrado(3);
        figuras[1] = new Circulo(3);
        figuras[2] = new Triangulo(3);

        for (FiguraI fg : figuras) {
            System.out.println(fg.perimetro());
            System.out.println(fg.area());
        }
    }
}
