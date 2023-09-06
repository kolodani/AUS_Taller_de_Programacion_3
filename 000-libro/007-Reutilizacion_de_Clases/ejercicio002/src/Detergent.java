class Cleanser{
    private String s = "Cleanser";
    public void append(String a){ s += a; }
    public void dilute(){ append(" dilute()"); }
    public void apply(){ append(" apply()"); }
    public void scrub(){ append(" scrub()"); }
    public String toString(){ return s; }
}

public class Detergent extends Cleanser {
    // Cambio de un metodo:
    public void scrub(){
        append(" Detergent.scrub()");
        super.scrub(); // Invocar version de la clase base
    }
    // añadir metodos a la interfaz:
    public void foam(){ append(" foam()"); }
}
