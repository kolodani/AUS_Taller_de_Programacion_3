public class RoedoresApp {
    public static void main(String[] args) {
        MiembroCompartido mc = new MiembroCompartido();
        Roedor[] ratitas = {
            new Cobayo(mc),
            new Hamster(mc),
            new Raton(mc),
        };
        for (Roedor roedor : ratitas) {
            System.out.println(roedor);
            roedor.comer();
            roedor.correr();
            roedor.dormir();
        }
        for (Roedor roedor : ratitas) {
            roedor.dispose();
        }
    }
}
