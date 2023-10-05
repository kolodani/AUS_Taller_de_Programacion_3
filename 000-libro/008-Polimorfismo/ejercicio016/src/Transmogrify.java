/*
 *  Ejercicio 16:
 *  Siguiendo el ejemplo de Transmogrify.java, cree una clase Starship que contenga una referencia
 *  AlertStatus que pueda indicar tres estados distintos. Incluya métodos para verificar los estados.
*/

public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
        Starship enterprise = new Starship();
        System.out.println(enterprise);
        enterprise.setStatus(new YellowAlertStatus());
        System.out.println(enterprise);
        enterprise.setStatus(new RedAlertStatus());
        System.out.println(enterprise);
    }
}
