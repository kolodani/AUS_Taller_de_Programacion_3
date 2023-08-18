/*
 *  Ejercicio 9
 *  Escriba un programa que demuestre que el mecanismo automático de conversión de tipos funciona
 *  para todos los tipos primitivos y sus envoltorios.
*/

public class App {
    public static void main(String[] args) throws Exception {
        boolean b = true;
        Boolean bo = b;
        boolean bu = bo;
        System.out.println(bo);
        System.out.println(bu);

        char c = 'C';
        Character ca = c;
        char co = ca;
        System.out.println(ca);
        System.out.println(co);

        byte by = 8;
        Byte byt = by;
        byte byt2 = byt;
        System.out.println(byt);
        System.out.println(byt2);

        short s = 16;
        Short sh = s;
        short sh2 = sh;
        System.out.println(sh);
        System.out.println(sh2);

        int i = 32;
        Integer in = i;
        int in2 = in;
        System.out.println(in);
        System.out.println(in2);

        long l = 64;
        Long lo = l;
        long lo2 = lo;
        System.out.println(lo);
        System.out.println(lo2);

        float f = 2.2f;
        Float fl = f;
        float fl2 = fl;
        System.out.println(fl);
        System.out.println(fl2);

        double d = 3.3;
        Double dou = d;
        double dou2 = dou;
        System.out.println(dou);
        System.out.println(dou2);
    }
}
