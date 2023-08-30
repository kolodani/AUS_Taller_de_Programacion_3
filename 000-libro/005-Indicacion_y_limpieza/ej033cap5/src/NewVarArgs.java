class A{}

public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Admite elementos individuales:
        printArray(new Integer(47), new Float(3.14), new Double(11.11));
        printArray(47, 3.14F, 11.11);
        printArray("uno", "dos", "tres");
        printArray(new A(), new A(), new A());
        // O la matriz:
        printArray((Object[]) new Integer[]{1, 2, 3, 4});
        printArray(); // Se admite una lista vacía
    }
}
