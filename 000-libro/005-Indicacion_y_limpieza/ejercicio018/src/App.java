/*
 *  Ejercicio 18:
 *  Complete el ejercicio anterior creando objetos que asociar a la matriz de referencias.
*/

public class App {
    public static void main(String[] args) throws Exception {
        Test[] arreglo1 = new Test[5];
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = new Test("Grover " + i);
        }
    }
}
