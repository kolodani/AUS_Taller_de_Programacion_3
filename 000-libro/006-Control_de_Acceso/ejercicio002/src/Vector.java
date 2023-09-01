public class Vector {
    private int x;
    private int y;
    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Vector(){
        this.x = 0;
        this.y = 0;
    }
    public void mostrar(){
        System.out.println("x: " + this.x + " y: " + this.y);
    }
}
