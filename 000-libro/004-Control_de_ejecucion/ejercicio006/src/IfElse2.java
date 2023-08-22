public class IfElse2 {
    static int test(int testval, int targer, int begin, int end){
        if ((testval >= begin) && (testval <= end)) {
            System.out.println("Dentro del rango");
        }else if (testval < begin){
            System.out.println("Debajo del rango");
        }
        else if (testval > end){
            System.out.println("Por encima del rango");
        }
        else{
            System.out.println("ERROR");
        }
        if (testval > targer) {
            return +1;
        }
        else if (testval < targer){
            return -1;
        }
        else {
            return 0;
        }
    }
}
