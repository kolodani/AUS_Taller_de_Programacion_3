class Soup1{
    private Soup1(){}
    // Permite la creacion a traves de un metodo estatico:
    public static Soup1 makeSoup(){
        return new Soup1();
    }
}

class Soup2{
    private Soup2(){}
    // Crea un objeto estatuco y devuelve una referencia
    // cuando se solicita. (El patron "Singleton"):
    private static Soup2 ps1 = new Soup2();
    public static Soup2 access(){
        return ps1;
    }
    public void f(){}
}

// solo se permite una clase publica por archivo:
public class Lunch {
    void testPrivate(){
        // No se puede hacer un constructor:
        //! Soup1 soup = new Soup1();
    }
    void testStatic(){
        Soup1 soup = Soup1.makeSoup();
    }
    void testSingleton(){
        Soup2.access().f();
    }
}
