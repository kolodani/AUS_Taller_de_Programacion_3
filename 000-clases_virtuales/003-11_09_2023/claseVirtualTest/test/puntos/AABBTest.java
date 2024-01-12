package puntos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class AABBTest {

    private Punto orig1;
    private Punto orig2;
    private AABB aabb;

    @BeforeEach
    void init() {
        orig1 = new Punto(100, 100);
        orig2 = new Punto(125, 125);
        aabb = new AABB(orig1, orig2);
    }

    @Test
    void testUnoNoIntersect() {
        Punto uno1 = new Punto(25, 100);
        Punto uno2 = new Punto(50, 125);
        AABB aabbUno = new AABB(uno1, uno2);

        assertFalse(aabb.intersect(aabbUno));
    }

    @Test
    void testUnoIntersect() {
        Punto uno1 = new Punto(95, 95);
        Punto uno2 = new Punto(105, 105);
        AABB aabbUno = new AABB(uno1, uno2);

        assertTrue(aabb.intersect(aabbUno));
    }

    @Test
    void testDosNoIntersect() {
        Punto uno1 = new Punto(100, 25);
        Punto uno2 = new Punto(125, 50);
        AABB aabbUno = new AABB(uno1, uno2);

        assertFalse(aabb.intersect(aabbUno));
    }

    @Test
    void testDosIntersect() {
        Punto uno1 = new Punto(120, 100);
        Punto uno2 = new Punto(130, 105);
        AABB aabbUno = new AABB(uno1, uno2);

        assertTrue(aabb.intersect(aabbUno));
    }

    @Test
    void testTresNoIntersect() {
        Punto uno1 = new Punto(150, 100);
        Punto uno2 = new Punto(175, 125);
        AABB aabbUno = new AABB(uno1, uno2);

        assertFalse(aabb.intersect(aabbUno));
    }

    @Test
    void testTresIntersect() {
        Punto uno1 = new Punto(120, 120);
        Punto uno2 = new Punto(130, 130);
        AABB aabbUno = new AABB(uno1, uno2);

        assertTrue(aabb.intersect(aabbUno));
    }

    @Test
    void testCuatroNoIntersect() {
        Punto uno1 = new Punto(100, 150);
        Punto uno2 = new Punto(125, 175);
        AABB aabbUno = new AABB(uno1, uno2);

        assertFalse(aabb.intersect(aabbUno));
    }

    @Test
    void testCUatroIntersect() {
        Punto uno1 = new Punto(95, 120);
        Punto uno2 = new Punto(105, 130);
        AABB aabbUno = new AABB(uno1, uno2);

        assertTrue(aabb.intersect(aabbUno));
    }
}
