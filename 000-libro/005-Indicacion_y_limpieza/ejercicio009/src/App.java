/*
 *  Ejercicio 09:
 *  Cree una clase con dos constructores (sobrecargados). Utilizando this, invoque el segundo constructor desde dentro
 *  del primero.
*/

class Dog{
    int edad;
    String nombre;
    Dog(){
        this("Sparky", 5);
        System.out.println("Constructor por defecto");
    }
    Dog(String s, int i){
        nombre = s;
        edad = i;
        System.out.println("Constructor con argumentos");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Dog beto = new Dog();
        System.out.println("El nombre del perro es " + beto.nombre + " y tiene " + beto.edad + " años de edad");
    }
}
