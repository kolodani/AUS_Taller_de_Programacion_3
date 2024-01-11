package puntos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class PuntoTest {
	
	private Punto p;
	private Punto p2;
	private Punto p3;
	
	@BeforeEach
	void init () {
		p = new Punto();
		p2 = new Punto(3, 5);
		p3 = new Punto(4, 3);
	}

	@Test
	void testNewPointInZeroX() {
		assertEquals(0, p.getX());
	}
	
	@Test
	void testNewPointInZeroY() {
		assertEquals(0, p.getY());
	}

	@Test
	void testNewPointwithX() {
		assertEquals(3, p2.getX());
	}
	
	@Test
	void testNewPointwithY() {
		assertEquals(5, p2.getY());
	}
	
	@Test
	void testDistance() {
		assertEquals(5, p.distance(p3));
	}
}






