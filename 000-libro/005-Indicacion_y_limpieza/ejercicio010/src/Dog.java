public class Dog {
    int edad;
    Dog(){
        edad = 1;
        System.out.println("perro creado");
    }
    protected void finalize(){
        System.out.println("finalize() activado");
    }
}
