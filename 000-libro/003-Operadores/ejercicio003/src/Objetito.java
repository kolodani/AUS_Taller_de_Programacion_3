public class Objetito {
    static void laFuncion(Letra x){
        x.caracter = 'X';
    }
    public static void main(String[] args) {
        Letra uya = new Letra();
        uya.caracter = 'u';
        System.out.println("El caracter guardado es: " + uya.caracter);
        laFuncion(uya);
        System.out.println("El caracter guardado es: " + uya.caracter);
    }
}
