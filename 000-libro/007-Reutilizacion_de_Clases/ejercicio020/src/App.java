/*
 *  Ejercicio 20:
 *  Demuestre que la anotación @Override resuelve el problema descrito en esta sección.
*/

class Epp extends WithFinal {
    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }
    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}

public class App extends Epp{
    public final void f() {
        System.out.println("OverridingPrivate2.f()");
    }
    public void g() {
        System.out.println("OverridingPrivate2.g()");
    }
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.f();
        app.g();
    }
}
