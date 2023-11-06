public class IncDecDemo2{
    public static void main(String[] args){
        Counter c = new Counter();
        DecThread it = new DecThread(c, "lolo");
        it.start();
        try {
            it.join();
        } catch (InterruptedException e) {
            // InterruptedException
        }
        System.out.println(c.getCounter());
    }
}
