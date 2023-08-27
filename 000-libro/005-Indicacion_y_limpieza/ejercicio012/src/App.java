/*
 *  Ejercicio 12:
 *  Cree una clase denominada Tank (tanque) que pueda ser llenado y vaciado, y cuya condición de terminación es que el
 *  objeto debe estar vacío en el momento de limpiarlo. Escriba un método finalize() que verifique esta condición de
 *  terminación. En main()), compruebe los posibles casos que pueden producirse al utilizar los objetos Tank.
*/

public class App {
    public static void main(String[] args) throws Exception {
        new Tank();
        new Tank().vacio();
        new Tank();
        new Tank().vacio();
        System.gc();
        System.runFinalization();
    }
}
