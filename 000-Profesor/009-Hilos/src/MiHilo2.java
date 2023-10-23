public class MiHilo2 implements Runnable {
    @Override
    public void run(){
        for(int i = 10000;i > 0; i--){
            System.out.println(i);
        }
    }
}
