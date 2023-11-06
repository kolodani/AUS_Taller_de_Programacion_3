public class Counter {
    private int counter;

    public synchronized void inc() {
        counter++;
    }

    public void dec() {
        synchronized(this){
            counter--;
        }
    }

    public int getCounter(){
        return counter;
    }
}
