public class Cobayo extends Roedor{
    Miembro m1 = new Miembro("miembro de Cobayo 1");
    Miembro m2 = new Miembro("miembro de Cobayo 2");

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
