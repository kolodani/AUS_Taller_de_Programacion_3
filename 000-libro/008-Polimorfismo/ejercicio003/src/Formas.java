public class Formas {
    public static void main(String[] args) {
        Shape[] formas = {
            new Circle(),
            new Square(),
            new Triangle()
        };
        for(Shape forma : formas) {
            forma.draw();
            forma.erase();
            forma.printMessage();
        }
    }
}
