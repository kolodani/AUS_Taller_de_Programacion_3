public class Connection {
    private static int count = 0;
    private int id = count++;
    Connection() {}
    public String toString() {
        return "Connection " + id;
    }
    public void doSomething() {
        System.out.println("Connection " + id + " doSomething()");
    }
}
