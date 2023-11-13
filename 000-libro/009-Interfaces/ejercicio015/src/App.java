/*
 *  Ejercicio 15:
 *  Modifique el ejercicio anterior creando una clase abstracta y haciendo que la clase derivada herede de ella.
*/

public class App {
    static void volador(Volador v) {
        v.volar();
        v.aterrizar();
    }
    static void terrestre(Terrestre t) {
        t.correr();
        t.caminar();
    }
    static void nadador(Nadador n) {
        n.nadar();
        n.bucear();
    }
    static void todoTerreno(TodoTerreno tt) {
        tt.volar();
        tt.aterrizar();
        tt.correr();
        tt.caminar();
        tt.nadar();
        tt.bucear();
        tt.comer();
    }
    static void Animal(Animal a) {
        a.respirar();
    }
    public static void main(String[] args) throws Exception {
        Pato p = new Pato("Super Pato");
        volador(p);
        terrestre(p);
        nadador(p);
        todoTerreno(p);
        Animal(p);
    }
}
