// "e" significa "10 elevado a".

public class Exponents {
    public static void main(String[] args) {
        // 'e' en minúscula o mayúscula funcionan igual:
        float expFloat = 1.39e-43f;
        expFloat = 1.39E-43f;
        System.out.println(expFloat);
        double expDouble = 47e47d; // 'd' es opcional
        double expDouble2 = 47e47; // automaticamente double
        System.out.println(expDouble);
    }
}
