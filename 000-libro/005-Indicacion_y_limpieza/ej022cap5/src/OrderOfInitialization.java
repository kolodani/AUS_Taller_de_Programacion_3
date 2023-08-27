// Cuando se invoca el constructor para crear un objeto Window, aparecera el mensaje:
class Window{
    Window(int marker){
        System.out.println("Window(" + marker + ")");
    }
}

class House{
    Window w1 = new Window(1); // Antes del constructor
    House(){
        // Mostrar que estamos en el constructor:
        System.out.println("House()");
        w3 = new Window(33); // Reinicializar w3
    }
    Window w2 = new Window(2); // Despues del constructor
    void f(){
        System.out.println("f()");
    }
    Window w3 = new Window(3); // Al final
}

public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f(); // Muestra que la construccion ha finalizado
    }
}
