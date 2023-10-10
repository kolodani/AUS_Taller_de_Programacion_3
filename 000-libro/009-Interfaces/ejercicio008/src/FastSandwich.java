public class FastSandwich extends Sandwich implements FastFood{
    public void prepararFastFood() {
        System.out.println("Preparando FastFood Sandwich");
    }

    public void comerFastFood() {
        System.out.println("Comiendo FastFood Sandwich");
    }

    public static void main(String[] args) {
        FastSandwich fs = new FastSandwich();
        System.out.println("Cual es su pedido?");
        fs.prepararFastFood();
        System.out.println("Su pedido esta listo!");
        fs.comerFastFood();
    }
}
