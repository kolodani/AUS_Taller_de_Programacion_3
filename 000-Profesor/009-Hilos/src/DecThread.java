public class DecThread extends Thread {
    private Counter c;

    public DecThread(Counter c, String name){
        super(name);
        this.c = c;
    }

    public void run(){
        for(int i = 10000; i > 0; i--){
            c.dec();
        }
    }
}
