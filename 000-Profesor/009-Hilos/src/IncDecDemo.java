public class IncDecDemo{
    public static void main(String[] args){
        Counter c = new Counter();
        IncThread it = new IncThread(c, "lolo");
        it.start();
        DecThread dt = new DecThread(c, "momo");
        dt.start();
        try {
            it.join();
            dt.join();
        } catch (InterruptedException e) {
            // InterruptedException
        }
        System.out.println(c.getCounter());
    }
}
