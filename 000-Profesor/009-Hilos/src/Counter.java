public class Counter {
    private int counter;

    public synchronized void inc() {
        counter++;
    }

    public void dec() {
        System.out.println("Un Monton de cosas");
        synchronized(this){
            counter--;
        }
    }

    public int getCounter(){
        return counter;
    }
}
