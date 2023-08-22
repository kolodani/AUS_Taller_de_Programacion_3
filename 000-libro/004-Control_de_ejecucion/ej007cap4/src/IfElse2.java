public class IfElse2 {
    static int test(int testval, int targer){
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
    public static void main(String[] args) {
        System.out.println(test(10, 5));
        System.out.println(test(5, 10));
        System.out.println(test(5, 5));
    }
}
