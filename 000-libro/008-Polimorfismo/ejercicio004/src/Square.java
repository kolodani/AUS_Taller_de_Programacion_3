public class Square extends Shape {
    @Override public void draw() {
        System.out.println("Square.draw()");
    }
    @Override public void erase() {
        System.out.println("Square.erase()");
    }
    public void printMessage() {
        System.out.println("Square.printMessage()");
    }
}
