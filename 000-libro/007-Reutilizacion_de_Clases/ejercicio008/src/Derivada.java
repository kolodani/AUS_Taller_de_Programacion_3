public class Derivada extends Base{
    public Derivada(){
        super(47);
        System.out.println("Clase Derivada");
    }
    public Derivada(int i){
        super(i);
        System.out.println("Clase Derivada: " + i);
    }

    public static void main(String[] args) {
        new Derivada();
        new Derivada(666);
    }
}
