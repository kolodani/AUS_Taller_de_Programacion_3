public class Dog {
    void bark(){
        System.out.println("Ladrido comun");
    }
    void bark(int i, String nombre){
        System.out.println(i + " veces a ladrado " + nombre);
    }
    void bark(char c){
        System.out.println("Gruñido");
    }
    void bark(String nombre, int i){
        System.out.println(nombre + " Ladra " + i + " veces");
    }
}
