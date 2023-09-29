public class Hamster extends Roedor{
    Miembro m1 = new Miembro("miembro de Hamster 1");
    Miembro m2 = new Miembro("miembro de Hamster 2");

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
