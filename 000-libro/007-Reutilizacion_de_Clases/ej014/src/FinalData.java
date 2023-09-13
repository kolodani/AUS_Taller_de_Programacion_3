import java.util.Random;

public class FinalData {
    private static Random rand = new Random(47);
    private String id;
    public FinalData(String id) {
        this.id = id;
    }
    // Pueden ser constantes de tiempo de compilacion:
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    // Constante publica tipica:
    public static final int VALUE_THREE = 39;
    // No pueden ser constantes de tiempo de compilacion:
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    // Matrices:
    private final int[] a = {1, 2, 3, 4, 5, 6};
    public String toString() {
        return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
    }
    public static void main(String[] args){
        FinalData fd1 = new FinalData("fd1");
        //! fd1.valueOne++; // Error: no se puede modificar el valor
        fd1.v2.i++; // El objero no es constante!
        fd1.v1 = new Value(9); // OK -- no es final
        for(int i = 0; i < fd1.a.length; i++){
            fd1.a[i]++; // Objeto no constante!
        }
        //! fd1.v2 = new Value(0); // Error: no se puede
        //! fd1.VAL_3 = new Value(1); // cambiar la referencia
        //! fd1.a = new int[3];
        System.out.println(fd1);
        System.out.println("Creando FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }
}
