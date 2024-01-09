public class Forma03 {
    // int es un tipo primitivo
    // Integer es una clase
    // costoso de inicializar
    private ObjetoSuperComplejo i;
    // No cuesta nada, rapido de inicializar
    private Integer pi;

    // Inicializacion Lazy
    // no voy a inicializar a la variable has que la necesite
    public Forma03() {
        pi = 100;
    }

    public ObjetoSuperComplejo getI() {
        // siempre la condicion del if es booleana en Java
        if(i == null){
            // inicializacion de i
            i = new ObjetoSuperComplejo();
        }
        return i;
    }

    public static void main(String[] args) {
        Forma03 f3 = new Forma03();
        System.out.println(f3.getI());
        System.out.println(f3.pi);
    }
}
