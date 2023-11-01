public class DimmerTest {
    public static void main(String[] args) {
        Dimmer d1 = new Dimmer();
        d1.inc();
        System.out.println(d1.getIntensidad());
        System.out.println(d1.isPrendida());
        d1.off();
        System.out.println(d1.isPrendida());

        Dimmer d2 = new Dimmer();
        d2.on();
        System.out.println(d2.isPrendida());
        System.out.println(d2.getIntensidad());
    }
}
