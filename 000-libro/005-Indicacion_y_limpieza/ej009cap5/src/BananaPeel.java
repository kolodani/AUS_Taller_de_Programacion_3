class Banana{
    void peel(int i){
        System.out.println("Fueron peladas, " + i + " Bananas");
    }
}

public class BananaPeel {
    public static void main(String[] args) {
        Banana a = new Banana(), b = new Banana();
        a.peel(2);
        b.peel(3);
    }
}
