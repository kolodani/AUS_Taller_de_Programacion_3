public class Casting {
    public static void main(String[] args) {
        int i = 200;
        long lng = (long)i;
        lng = i; // "Ensanchamiento," por lo que no se requiere conversion
        long lng2 = (long)200;
        lng2 = 200;
        // Una "conversion de estrechamiento"
        i = (int)lng2; // proyeccion requerida
    }
}
