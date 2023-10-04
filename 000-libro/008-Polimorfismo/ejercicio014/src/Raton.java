public class Raton extends Roedor{
    MiembroNoCompartido m1 = new MiembroNoCompartido("miembro de Raton 1");
    MiembroNoCompartido m2 = new MiembroNoCompartido("miembro de Raton 2");
    public Raton(MiembroCompartido m) {
        super(m);
        System.out.println("Raton construido");
    }
    public void comer() {
        System.out.println("Raton comiendo");
    }

    public void dormir() {
        System.out.println("Raton durmiendo");
    }

    public void correr() {
        System.out.println("Raton corriendo");
    }

    public String toString() {
        return "Raton";
    }
}
