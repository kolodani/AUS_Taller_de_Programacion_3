public class IncThread extends Thread {
    private Counter c;

    public IncThread(Counter c, String name){
        super(name);
        this.c = c;
    }

    public void run(){
        for(int i = 0; i < 10000; i++){
            c.inc();
        }
    }
}
