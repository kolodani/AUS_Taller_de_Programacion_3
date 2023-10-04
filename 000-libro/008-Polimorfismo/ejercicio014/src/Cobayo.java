public class Cobayo extends Roedor{
    private MiembroCompartido m;
    MiembroNoCompartido m1 = new MiembroNoCompartido("miembro de Cobayo 1");
    MiembroNoCompartido m2 = new MiembroNoCompartido("miembro de Cobayo 2");
    public Cobayo(MiembroCompartido m) {
        super(m);
        System.out.println("Cobayo construido");
    }
    public void comer() {
        System.out.println("Cobayo comiendo");
    }

    public void dormir() {
        System.out.println("Cobayo durmiendo");
    }

    public void correr() {
        System.out.println("Cobayo corriendo");
    }

    public String toString() {
        return "Cobayo";
    }
}
