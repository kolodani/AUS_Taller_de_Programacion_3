class A {
    interface B {
        void f();
    }
    public class BImp implements B {
        public void f() {}
    }
    private class BImp2 implements B {
        public void f() {}
    }
    public interface C {
        void f();
    }
    class CImp implements C {
        public void f() {}
    }
    private class CImp2 implements C {
        public void f() {}
    }
    private interface D {
        void f();
    }
    private class DImp implements D {
        public void f() {}
    }
    public class DImp2 implements D {
        public void f() {}
    }
    public D getD() { return new DImp2(); }
    private D dRef;
    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }
    interface E {
        interface G {
            void f();
        }
        // "public" redundante:
        public interface H {
            void f();
        }
        void g();
        // No puede ser private dentro de una interfaz:
        //! private interface I {}
    }

    public class NestingInterfaces {
        public class BImp implements A.B {
            public void f() {}
        }
        class CImp implements A.C {
            public void f() {}
        }
        // No se puede implementar una interfaz privada excepto dentro de la clase definitoria de dicha interfaz:
        //! class DImp implements A.D {
        //!     public void f() {}
        //! }
        class EImp implements E {
            public void g() {}
        }
        class EGImp implements E.G {
            public void f() {}
        }
        class EImp2 implements E {
            public void g() {}
            class EG implements E.G {
                public void f() {}
            }
        }
    }
    public static void main(String[] args) {
        A a = new A();
        // NO se puede acceder a A.D:
        //! A.D ad = a.getD();
        // Solo puede devolder a A.D:
        //! A.DImp2 di2 = a.getD();
        // No se puede acceder a un miembro de la interfaz:
        //! a.getD().f();
        // Solo otra A puede utilizar getD():
        A a2 = new A();
        a2.receiveD(a.getD());
    }
}
