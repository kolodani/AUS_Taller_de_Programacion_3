/*
 *  Ejercicio 14:
 *  Cree tres interfaces, cada una de ellas con dos métodos. Defina mediante herencia una nueva interfaz que combine
 *  las tres, añadiendo un nuevo método. Cree una clase implementando la nueva interfaz y que también herede de una
 *  clase concreta. A continuación, escriba cuatro métodos, cada uno de los cuales tome una de las cuatro interfaces
 *  como argumento. En main(), cree un objeto de esa clase y páselo a cada uno de los métodos.
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
    public static void main(String[] args) throws Exception {
        Pato p = new Pato();
        volador(p);
        terrestre(p);
        nadador(p);
        todoTerreno(p);
    }
}
