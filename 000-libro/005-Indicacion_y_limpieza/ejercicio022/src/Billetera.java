/*
 *  Ejercicio 22:
 *  Escriba una instrucción switch para el tipo enum del ejercicio anterior. En cada case, imprima una descripción de
 *  ese billete concreto.
*/

public class Billetera {
    Billetes billete;
    public Billetera(Billetes billete){
        this.billete = billete;
    }
    public void descripcion(){
        System.out.print("El Billete de: " + billete + " es de color: ");
        switch (billete) {
            case CINCO:
                System.out.println("GRIS");
                break;
            case DIEZ:
                System.out.println("ROSA");
                break;
            case VEINTE:
                System.out.println("CELESTE");
                break;
            case CINCUENTA:
                System.out.println("ANARANJADO");
                break;
            case CIEN:
                System.out.println("VERDE");
                break;
            case DOSCIENTOS:
                System.out.println("AMARILLO");
                break;
            default:
                break;
        }
    }
    public static void main(String[] args) {
        Billetera
            daniel = new Billetera(Billetes.CINCO),
            andres = new Billetera(Billetes.DOSCIENTOS),
            elias = new Billetera(Billetes.DIEZ),
            santiago = new Billetera(Billetes.VEINTE),
            juan = new Billetera(Billetes.CIEN),
            lucas = new Billetera(Billetes.CINCUENTA);
        daniel.descripcion();
        andres.descripcion();
        elias.descripcion();
        santiago.descripcion();
        juan.descripcion();
        lucas.descripcion();
    }
}
