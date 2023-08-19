public class Coin {
    boolean caraMonada;
    public void lanzar(double d){
        if(d > 0.5){
            caraMonada = true;
        } else {
            caraMonada = false;
        }
    }
}
