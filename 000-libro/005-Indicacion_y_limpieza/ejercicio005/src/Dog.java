public class Dog {
    void bark(){
        System.out.println("Ladrido comun");
    }
    void bark(int i){
        System.out.println("Ladra " + i + " veces");
    }
    void bark(char c){
        System.out.println("Gruñido");
    }
    void bark(String nombre){
        System.out.println(nombre + " Ladra de felicidad y mueve la cola");
    }
}
