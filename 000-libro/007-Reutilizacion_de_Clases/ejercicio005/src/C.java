/*
 *  Ejercicio 05:
 *  Cree dos clases, A y B, con constructores predeterminados (listas de argumentos vacias) que impriman un mensaje
 *  informando de la construcción de cada objeto. Cree una nueva clase llamada C que herede de A, y cree un miembro de
 *  la clase B dentro de C. No cree un constructor para C. Cree un objeto de la clase C y observe los resultados.
*/

public class C extends A{
    B b = new B();

    public static void main(String[] args) {
        new C();
    }
}
