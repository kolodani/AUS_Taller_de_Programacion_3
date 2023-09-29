public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub(); // Generalizacion
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }
}