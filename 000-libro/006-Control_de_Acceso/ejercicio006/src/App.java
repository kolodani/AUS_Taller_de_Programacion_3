/*
 *  Ejercicio 06:
 *  Cree una clase con datos protegidos. Cree una segunda clase en el mismo archivo con un método que manipule los
 *  datos protegidos de la primera clase.
*/

class Dog{
    String Nombre;
    int edad;
}

public class App {
    public static void main(String[] args) throws Exception {
        Dog pepe = new Dog();
        pepe.Nombre = "Grover";
        pepe.edad = 8;
        System.out.println("El perro " + pepe.Nombre + " tiene " + pepe.edad + " años de edad");
    }
}
