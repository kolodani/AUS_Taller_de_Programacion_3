public class Factories {
    public static void serviceConstumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }
    public static void main(String[] args) {
        serviceConstumer(new Implementation1Factory());
        // Implementations are completely interchangeable:
        serviceConstumer(new Implementation2Factory());
    }
}
