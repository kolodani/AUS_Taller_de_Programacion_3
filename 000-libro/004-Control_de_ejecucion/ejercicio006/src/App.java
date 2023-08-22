/*
 *  Ejercicio 06:
 *  Modifique los dos métodos test() de los dos programas anteriores para que admitan dos argumentos adicionales, begin
 *  y end, y para que se compruebe testval para ver si se encuentra dentro del rango comprendido entre begin y end
 *  (ambos incluidos).
*/

public class App {
    public static void main(String[] args) throws Exception {
        IfElse ejemplo1 = new IfElse();
        IfElse2 ejemplo2 = new IfElse2();
        ejemplo1.test(10, 5, 0, 20);
        System.out.println("Resultado: " + ejemplo1.result);
        System.out.println("Resultado: " + ejemplo2.test(10, 5, 0, 20));
    }
}

