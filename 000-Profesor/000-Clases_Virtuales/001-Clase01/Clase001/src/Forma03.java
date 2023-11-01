public class Forma03 {
    // Inicializacion en la declaracion

    // Muy costoso de inicializar
    private ObjetoMuyComplejo i;

    // Rapido de inicializar
    private Integer pi;

    // Inicializacion en el constructor
    public Forma03() {
        pi = 100;
    }

    public ObjetoMuyComplejo getI() {
        if(i == null){
            // Inicizlizacion de i
            i = new ObjetoMuyComplejo();
        }
        return i;
    }

        public static void main(String[] args) {
        Forma03 f1 = new Forma03();
        System.out.println(f1.getI());
    }
}
