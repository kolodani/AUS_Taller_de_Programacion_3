class Gismo {
	public void spin(){}
}

public class FinalArguments {
	void with(final Gismo g){
		//! g = new Gismo();  // Ilegal -- g es final
	}
	void without(Gismo g){
		g = new Gismo(); // OK -- g no es final
		g.spin();
	}
	// void f(final int i) { i++: } // No se puede cambiar
	// Laas primitivas final solo pueden leerse:
	int g(final int i) {
		return i + 1;
	}
	public static void main(String[] args){
		FinalArguments bf = new FinalArguments();
		bf.without(null);
		bf.with(null);
	}
}
