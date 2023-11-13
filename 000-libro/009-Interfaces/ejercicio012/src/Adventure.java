/*
 *  Ejercicio 12:
 *  En Adventure.java, añada una interfaz llamada CanClimb, siguiendo el patrón de las otras interfaces.
*/

public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }
    public static void u(CanSwim x) {
        x.swim();
    }
    public static void v(CanFly x) {
        x.fly();
    }
    public static void w(ActionCharacter x) {
        x.fight();
    }
    public static void x(CanClimb x) {
        x.climb();
    }
    public static void main(String[] args) {
        Hero h = new Hero();
        t(h); // Treat it as a CanFight
        u(h); // Treat it as a CanSwim
        v(h); // Treat it as a CanFly
        w(h); // Treat it as an ActionCharacter
        x(h); // Treat it as a CanClimb
    }
}
