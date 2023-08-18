import java.util.*;

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

        DataOnly data = new DataOnly();
        data.i = 47;
        data.d = 1.1;
        data.b = false;
        System.out.println(data.i);
        System.out.println(data.d);
        System.out.println(data.b);

        int ejemplo = data.storage("Daniel");
        System.out.println(ejemplo);

        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println(st1.i);
        System.out.println(st2.i);
        StaticTest.i++;
        System.out.println(st1.i);

        Incrementable sf = new Incrementable();
        sf.increment();
        System.out.println(st1.i);
        Incrementable.increment();
        System.out.println(st1.i);

        System.out.println("Hello, it's: ");
        System.out.println(new Date());
    }
}
