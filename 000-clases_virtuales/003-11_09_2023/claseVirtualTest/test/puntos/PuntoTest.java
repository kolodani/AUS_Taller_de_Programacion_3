package puntos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PuntoTest {

	@Test
	void testNewPointInZeroX() {
		// Arrange
		Punto p = new Punto();
		// Act
		int x = p.getX();
		// Assert
		assertEquals(0, x);
	}
	
	@Test
	void testNewPointInZeroY() {
		Punto p = new Punto();
		assertEquals(0, p.getY());
	}

	@Test
	void testNewPointwithX() {
		Punto p = new Punto(3, 5);
		assertEquals(3, p.getX());
	}
	
	@Test
	void testNewPointwithY() {
		Punto p = new Punto(3, 5);
		assertEquals(5, p.getY());
	}
	
	@Test
	void testDistance() {
		Punto p1 = new Punto(0, 0);
		Punto p2 = new Punto(4, 3);
		assertEquals(5, p1.distance(p2));
	}
}






