/*
 *  Ejercicio 14:
 *  Escriba un método que tome dos argumentos de tipo String y utilice todas las comparaciones boolean para comparar
 *  las dos cadenas de caracteres e imprimir los resultados. Para las comparaciones == y !=, realice también la prueba
 *  con equals(). En main (), invoque el método que haya escrito, utilizando varios objetos String diferentes.
*/

public class App {
    void comparar(String a, String b){
        System.out.println("Comparando: "+a+" y "+b);
        System.out.println("a == b: "+(a==b));
        System.out.println("a != b: "+(a!=b));
        System.out.println("a.equals(b): "+(a.equals(b)));
    }
    public static void main(String[] args) throws Exception {
        String s1, s2;
        s1 = "Daniel";
        s2 = "daniel";
        App objeto = new App();
        objeto.comparar(s1, s2);
    }
}
