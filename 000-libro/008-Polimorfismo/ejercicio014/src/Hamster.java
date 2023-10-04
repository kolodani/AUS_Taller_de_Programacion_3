public class Hamster extends Roedor{
    private MiembroCompartido m;
    MiembroNoCompartido m1 = new MiembroNoCompartido("miembro de Hamster 1");
    MiembroNoCompartido m2 = new MiembroNoCompartido("miembro de Hamster 2");
    public Hamster(MiembroCompartido m) {
        super(m);
        System.out.println("Hamster construido");
    }
    public void comer() {
        System.out.println("Hamster comiendo");
    }

    public void dormir() {
        System.out.println("Hamster durmiendo");
    }

    public void correr() {
        System.out.println("Hamster corriendo");
    }

    public String toString() {
        return "Hamster";
    }
}
