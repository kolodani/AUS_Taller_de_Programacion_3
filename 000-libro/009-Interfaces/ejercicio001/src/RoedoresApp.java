public class RoedoresApp {
    public static void main(String[] args) {
        Roedor[] ratitas = {
            new Cobayo(),
            new Hamster(),
            new Raton(),
        };
        for (Roedor roedor : ratitas) {
            System.out.println(roedor);
            roedor.comer();
            roedor.correr();
            roedor.dormir();
        }
    }
}
