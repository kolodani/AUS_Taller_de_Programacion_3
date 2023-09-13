public class Perro {
    private String nombre;
    private int edad;
    Perro(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("Perro llamado: " + nombre + " de " + edad + " años");
    }
}
