/*
 *  Ejercicio 16:
 *  Cree una clase que genere una secuencia de caracteres. Adapte esta clase para que pueda utilizarse como entrada a
 *  un objeto Scanner.
*/

import java.nio.*;
import java.util.*;

public class App extends CharSequence implements Readable{
    private int count;
    public App(int count) {
        this.count = count;
    }
    public int read(CharBuffer cb) {
        if(count-- == 0)
            return -1;
        char[] buffer = generate();
        cb.put(buffer);
        return buffer.length;
    }
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(new App(10));
        while(s.hasNext()) {
            System.out.println(s.next());
        }
    }
}
