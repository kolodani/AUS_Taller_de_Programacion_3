/*
 *  Ejercicio 08:
 *  Cree una instrucción switch que imprima un mensaje para cada case, y coloque el switch dentro de un bucle for en el
 *  que se pruebe cada uno de los valores de case. Incluya una instrucción break después de cada case y compruebe los
 *  resultados; a continuación, elimine las instrucciones break y vea lo que sucede.
*/

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5 ; i++) {
            switch(i){
                case 0:
                    System.out.println("Comienzo del bucle " + i);
                    break;
                case 1:
                    System.out.println("Primer bucle listo " + i);
                    break;
                case 2:
                    System.out.println("Caso 2 " +  i);
                    break;
                default:
                    System.out.println("Sin ideas");
            }
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("Caso sin break puesto");
        for (int i = 0; i < 5 ; i++) {
            switch(i){
                case 0:
                    System.out.println("Comienzo del bucle " + i);
                case 1:
                    System.out.println("Primer bucle listo " + i);
                case 2:
                    System.out.println("Caso 2 " +  i);
                default:
                    System.out.println("Sin ideas");
            }
        }
    }
}
