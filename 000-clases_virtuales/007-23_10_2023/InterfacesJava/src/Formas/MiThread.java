package Formas;

public class MiThread extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("En el run");
    }
}
