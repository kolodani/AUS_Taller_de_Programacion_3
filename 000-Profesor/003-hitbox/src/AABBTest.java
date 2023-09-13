public class AABBTest {
    public static void main(String[] args) {
        Punto a1 = new Punto(1, 5);
        Punto a2 = new Punto(3, 2);
        Punto b1 = new Punto(7, 8);
        Punto b2 = new Punto(10, 1);
        Punto c1 = new Punto(6, 4);
        Punto c2 = new Punto(7, 3);

        AABB caja1 = new AABB(a1, a2);
        AABB caja2 = new AABB(b1, b2);
        AABB caja3 = new AABB(c1, c2);

        while(!caja1.colision(caja2)){

            caja1.move();
            caja1.printCaja();
            System.out.println(caja1.colision(caja2));
        }

        System.out.println("HEADSHOT");
    }
}
