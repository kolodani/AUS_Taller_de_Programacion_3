public class Dog {
    String nombre;
    String raza = "Beagle";
    int edad = 0;
    float peso = 0.0f;

    public Dog(String nombre){
        System.out.println("Perro listo para ser entregado");
        edad = 1;
        this.nombre = nombre;
    }

    public String toString(){
        if(peso == 0.0f){
            peso = 3.5f;
        }
        if(nombre == null){
            nombre = "Sin nombre";
        }
        return "Nombre: " + nombre + "\nRaza: " + raza + "\nEdad: " + edad + "\nPeso: " + peso;
    }
}
