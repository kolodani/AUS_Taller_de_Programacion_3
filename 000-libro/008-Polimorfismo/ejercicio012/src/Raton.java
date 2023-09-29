public class Raton extends Roedor{
    Miembro m1 = new Miembro("miembro de Raton 1");
    Miembro m2 = new Miembro("miembro de Raton 2");

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
