public class IfElse {
    static int result = 0;
    static void test(int testval, int target, int begin, int end){
        if(testval > target)
            result = +1;
        else if(testval < target)
            result = -1;
        else
            result = 0;
        if ((testval >= begin) && (testval <= end)) {
            System.out.println("Dentro del rango");
        } else if (testval < begin) {
            System.out.println("Debajo del rango");
        } else if (testval > end) {
            System.out.println("Por encima del rango");
        } else {
            System.out.println("ERROR");
        }
    }
}