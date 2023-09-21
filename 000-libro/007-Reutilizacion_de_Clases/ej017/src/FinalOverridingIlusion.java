class WithFinal{
    // identico al uso de "private" sola:
    private final void f(){
        System.out.println("WithFinal.f()");
    }
    // tambien automaticamente "final":
    private void g(){
        System.out.println("WithFinal.g()");
    }
}

class OverridingPrivate extends WithFinal {
    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }
    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    public final void f() {
        System.out.println("OverridingPrivate2.f()");
    }
    public void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}

public class FinalOverridingIlusion {
    public static void main(String[] args){
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        // Se puede generalizar:
        OverridingPrivate op = op2;
        // Pero no se puede invocar los metodos:
        //! op.f();
        //! op.g();
        // lo mismo aqui:
        WithFinal wf = op2;
        //! wf.f();
        //! wf.g();
    }
}