public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Daniel!");
        String s = new String("asdf");
        System.out.println(s);

        Character ch = 'x';
        System.out.println(ch);
        char c = ch;
        System.out.println(c);

        int x = 12;
        {
            int q = 96;
            System.out.println(x);
            System.out.println(q);
            // puedo imprimir x y q
        }
        System.out.println(x);
        //System.out.println(q);
        // puedo imprimir x pero no q porque esta fuera del 'scope'
    }
}
