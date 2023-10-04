/*
 *  Ejercicio 14:
 *  Modifique el Ejercicio 12 para que uno de los objetos miembro sea un objeto
 *  compartido. Utilice el método de recuento del número de referencias y
 *  demuestre que funciona adecuadamente.
*/

public class Roedor {
    private MiembroCompartido m;
    MiembroNoCompartido m1 = new MiembroNoCompartido("miembro de Roedor 1");
    MiembroNoCompartido m2 = new MiembroNoCompartido("miembro de Roedor 2");
    public Roedor(MiembroCompartido m) {
        System.out.println("Roedor construido");
        this.m = m;
        m.addRef();
    }
    public void comer() {
        System.out.println("Roedor comiendo");
    }
    public void dormir() {
        System.out.println("Roedor durmiendo");
    }
    public void correr() {
        System.out.println("Roedor corriendo");
    }
    protected void dispose() {
        System.out.println("Dispose() " + this);
        m.dispose();
    }
    public String toString(){
        return "Roedor";
    }
}
