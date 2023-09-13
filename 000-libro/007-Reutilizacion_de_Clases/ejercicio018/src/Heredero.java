public class Heredero {
    final Contador a = new Contador(); // cada vez que se crea una instancia de Heredero, se crea una instancia de Contador y el valor de su campo id se asigna al campo a que se incrementa en 1
    static final Contador b = new Contador(); // cada vez que se crea una instancia de Heredero, se crea una instancia de Contador y el valor de su campo id se asigna al campo b que es el mismo para todas las instancias de Heredero
    public String toString() {
        return "a = " + a.getId() + ", b = " + b.getId();
    }
}
