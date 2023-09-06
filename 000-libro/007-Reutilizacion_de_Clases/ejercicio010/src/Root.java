public class Root {
    int i = 47;
    Component1 c1 = new Component1(i);
    Component2 c2 = new Component2(i);
    Component3 c3 = new Component3(i);
    public Root(int j){
        System.out.println("ROOT: " + j);
    }
}
