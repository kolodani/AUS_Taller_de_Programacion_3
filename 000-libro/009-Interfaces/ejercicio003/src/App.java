/*
 *  Ejercicio 03:
 *  Cree una clase base con un método print( ) abstracto que se sustituye en una
 *  clase derivada. La versión sustituida del método debe imprimir el valor de
 *  una variable int definida en la clase derivada. En el punto de definición de
 *  esta variable, proporcione un valor distinto de cero. En el constructor de
 *  la clase base, llame a este método. En main( ), cree un objeto del tipo
 *  derivado y luego invoque su método print( ). Explique los resultados.
*/

public class App extends Base {
    public int variable = 10;
    public void print() {
        System.out.println("Valor de la variable: " + this.variable);
    }
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.print();
    }
}

// comportamiento de la aplicacion
// cuando se instancia un objeto de la clase app que extiende a la clase base
// se ejecuta el constructor de la clase base, el cual llama al metodo print
// y se imprime el valor de la variable de la clase base, que es 0 porque no
// se ha inicializado la variable de la clase app y tomo el valor por defecto
// de la variable de la clase base
// luego se ejecuta el constructor de la clase app, el cual inicializa la
// variable de la clase app con el valor 10