public class Ejemplo {
    static void f(String... args){
        int i = 1;
        for (String s : args) {
            System.out.println(i + ") " + s);
            i++;
        }
        System.out.println();
    }
}
