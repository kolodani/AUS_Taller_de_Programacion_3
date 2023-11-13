public class Pato extends Animal implements TodoTerreno{
    public Pato(String s) {
        super(s);
    }
    public void respirar() {
        System.out.println(s + " respirando");
    }
    public void volar() {
        System.out.println(s + " volando");
    }
    public void aterrizar() {
        System.out.println(s + " aterrizando");
    }
    public void correr() {
        System.out.println(s + " corriendo");
    }
    public void caminar() {
        System.out.println(s + " caminando");
    }
    public void nadar() {
        System.out.println(s + " nadando");
    }
    public void bucear() {
        System.out.println(s + " buceando");
    }
    public void comer() {
        System.out.println(s + " comiendo");
    }
}
