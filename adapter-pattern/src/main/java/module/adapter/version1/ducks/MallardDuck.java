package module.adapter.version1.ducks;

public class MallardDuck implements Duck {
    public MallardDuck() {
    }

    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I\'m flying");
    }
}