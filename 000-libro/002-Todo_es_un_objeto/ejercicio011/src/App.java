/*
 *  Ejercicio 11
 *  Transfome el ejemplo AllTheColorsOfTheRainbow en un programa que se pueda compilar y ejecutar.
*/

public class App {
    public static void main(String[] args) throws Exception {
        AllTheColorsOfTheRainbow arcoiris = new AllTheColorsOfTheRainbow();
        arcoiris.changeTheHueOfTheColors(14);
        System.out.println(arcoiris.getColor());
    }
}
