public class Stemc extends Rootc {
    Componente1 c1 = new Componente1(4);
    Componente2 c2 = new Componente2(5);
    Componente3 c3 = new Componente3(6);
    public Stemc(int i){
        super(i);
        System.out.println("Stemc");
    }
    public void dispose() {
        System.out.println("Stemc dispose");
        c3.dispose();
        c2.dispose();
        c1.dispose();
        super.dispose();
    }
}
