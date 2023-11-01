package contenedores;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>(4);
        a1.add("Hola");
        a1.add("Mundo");
        a1.add("Java");
        a1.add("Hola");
        a1.add("Hola");
        a1.add("Mundo");
        a1.add("Java");
        a1.add("Hola");
        //a1.add(new Integer(23));
        //a1.add(Boolean.TRUE);

        for (Object object : a1) {
            System.out.println(object);
        }
        System.out.println(a1.get(2));
        a1.ensureCapacity(1000);
        a1.trimToSize();
        a1.remove("Mundo");
    }
}
