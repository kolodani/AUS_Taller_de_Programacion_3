public class Rootc {
    Componente1 c1 = new Componente1(1);
    Componente2 c2 = new Componente2(2);
    Componente3 c3 = new Componente3(3);
    public Rootc(int i){
        System.out.println("Rootc");
    }
    public void dispose(){
        System.out.println("Rootc dispose");
        c3.dispose();
        c2.dispose();
        c1.dispose();
    }
}
