package puntos;

public class AABB {

    private Punto p1;
    private Punto p2;

    public AABB(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Boolean intersect(AABB aabbUno) {
        return aabbUno.getP2X() >= getP1X() &&
                aabbUno.getP2Y() >= getP1Y() &&
                getP2X() >= aabbUno.getP1X() &&
                getP2Y() >= aabbUno.getP1Y();
    }

    private int getP1X() {
        return p1.getX();
    }

    private int getP1Y() {
        return p1.getY();
    }

    private int getP2X() {
        return p2.getX();
    }

    private int getP2Y() {
        return p2.getY();
    }
}
