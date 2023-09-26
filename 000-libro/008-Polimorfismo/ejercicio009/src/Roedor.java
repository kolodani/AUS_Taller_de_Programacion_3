/*
 *  Ejercicio 09:
 *  Cree una jerarq íaa de herencia Roedor: ratón, jerbe, hamster, etc.). En la clase base proporcione
 *  los métodos que son comunes para todos los roedores, y sustituya estos métodos en las clases derivadas
 *  para obtener diferentes comportamientos dependiendo del tipo específico de roedor. Cree una matriz de
 *  objetos Roedor , rellénela con diferentes tipos específicos de roedores e invoque los métodos de la
 *  clase base para ver lo que sucede.
*/

public class Roedor {
    public void comer() {
        System.out.println("Roedor comiendo");
    }
    public void dormir() {
        System.out.println("Roedor durmiendo");
    }
    public void correr() {
        System.out.println("Roedor corriendo");
    }
    public String toString(){
        return "Roedor";
    }
}
