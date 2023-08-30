public class OverloadingVarargs2 {
    static void f(float i, Character... args) {
        System.out.println("first");
    }
    static void f(Character... args) {
        System.out.print("second");
    }
    public static void main(String[] args) {
        f(1, 'a');
        // f('a', 'b');
        // No compila porque el metodo f(float i, Character... args) es mas especifico que f(Character... args),
        // por lo tanto hay una ambiguedad entre los dos metodos.
    }
}
