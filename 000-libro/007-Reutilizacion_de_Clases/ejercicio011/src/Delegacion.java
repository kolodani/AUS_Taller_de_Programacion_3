class Cleanser{
    private String s = "Cleanser";
    public void append(String a){ s += a; }
    public void dilute(){ append(" dilute()"); }
    public void apply(){ append(" apply()"); }
    public void scrub(){ append(" scrub()"); }
    public String toString(){ return s; }
    public static void main(String[] args){
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}

class Detergent{
    private Cleanser limpiador = new Cleanser();
    // metodos
    public void append(String a){
        limpiador.append(a);
    }
    public void dilute(){
        limpiador.dilute();
    }
    public void apply(){
        limpiador.apply();
    }
    public void scrub(){
        append(" Detergent.scrub()");
        limpiador.scrub();
    }
    public String toString(){
        return limpiador.toString();
    }
    public void foam(){
        append(" foam()");
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Prueba de la clase base");
        Cleanser.main(args);
    }
}

public class Delegacion{
    public static void main(String[] args) {
        Detergent.main(args);
    }
}