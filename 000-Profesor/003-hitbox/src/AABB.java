
public class AABB {

    private Punto p1;
    private Punto p2;

    public AABB(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public boolean colision(AABB caja) {    //<>

        if(!(caja.p1.getY() < this.p2.getY() || caja.p2.getY() > this.p1.getY()) ){
            if(!(caja.p1.getX() > this.p2.getX() || caja.p2.getX() < this.p1.getX())){
                return true;
            }
        }
        return false;
    }

    public void printCaja(){
        System.out.println("Sup izq: (" + this.p1.getX() + ", " + this.p1.getY() + ")");
        System.out.println("Inf der: (" + this.p2.getX() + ", " + this.p2.getY() + ")");
    }

    public void move(){
        this.p1.moveOneX();
        this.p2.moveOneX();
    }
}
