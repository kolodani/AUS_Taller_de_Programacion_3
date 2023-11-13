public class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb {
    public void swim() {
        System.out.println("Hero.swim()");
    }
    public void fly() {
        System.out.println("Hero.fly()");
    }
    public void climb() {
        System.out.println("Hero.climb()");
    }
}
