package Formas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class MiRunnableDemo {

    public static void main(String[] args) {
        MiRunnable mr = new MiRunnable();
        Thread t = new Thread(mr);
        t.start();

        // polimorfismo
        ArrayList<String> lista = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();
        List<String> lista3 = new LinkedList<>();
        Set<String> set = new HashSet<>();
    }
}
