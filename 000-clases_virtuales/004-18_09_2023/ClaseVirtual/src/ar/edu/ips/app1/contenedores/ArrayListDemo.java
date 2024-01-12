package ar.edu.ips.app1.contenedores;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        // parametriso escribiendo que acepto solo Strings por eso me da error si quiero agregar un int o boolean
        // la referencia es la misma que el objeto
        ArrayList<String> a1 = new ArrayList<>(4);
        a1.add("Hola");
        a1.add("Chau");
        a1.add("Pepe");
        a1.add("Aloha");
        a1.add("Hola");
        a1.add("Chau");
        a1.add("Pepe");
        a1.add("Aloha");
        //a1.add(new Integer(23));
        //a1.add(Boolean.TRUE);
        for (String s : a1) {
            System.out.println(s);
        }
        System.out.println(a1.get(2));
        // asegura que el tamaño sea el que le paso
        a1.ensureCapacity(1000);
        // borra los espacios vacios
        a1.trimToSize();
        a1.remove("Hola");

        List<String> a2 = new ArrayList<>(4);
        a2.add("Hola");
        a2.add("Chau");
        a2.add("Pepe");
        a2.add("Aloha");
        a2.add("Hola");
        a2.add("Chau");
        a2.add("Pepe");
        a2.add("Aloha");
        // a2.add(new Integer(23));
        // a2.add(Boolean.TRUE);
        for (String s : a2) {
            System.out.println(s);
        }
        System.out.println(a2.get(2));
        // no funcionan los metodos de arraylist en list
        // a2.ensureCapacity(1000);
        // a2.trimToSize();
        a2.remove("Hola");
    }
}
