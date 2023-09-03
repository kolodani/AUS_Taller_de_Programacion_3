public class App {
    public static void main(String[] args) throws Exception {
        int[] a = Range.range(10);
        int[] b = Range.range(5, 10);
        int[] c = Range.range(5, 20, 3);
        for(int i : a)
            System.out.print(i + " ");
        System.out.println();
        for(int i : b)
            System.out.print(i + " ");
        System.out.println();
        for(int i : c)
            System.out.print(i + " ");
        System.out.println();
    }
}
