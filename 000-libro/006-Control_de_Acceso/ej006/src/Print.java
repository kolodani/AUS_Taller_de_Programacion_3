import java.io.*;

public class Print {
    // Imprimir con una nueva linea:
    public static void print(Object obj) {
        System.out.println(obj);
    }
    // Imprimir una nueva linea sola:
    public static void print() {
        System.out.println();
    }
    // Imprimir sin salto de linea:
    public static void printnb(Object obj) {
        System.out.print(obj);
    }
    // El nuevo printf() de Java SE5 (de C):
    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
