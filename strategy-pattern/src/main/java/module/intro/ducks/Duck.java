package module.intro.ducks;

import module.intro.behavior.fly.FlyBehavior;
import module.intro.behavior.quack.QuackBehavior;

/**
 * Created by Povilas on 2015.06.25.
 */
public abstract class Duck {

    public QuackBehavior quackBehavior;

    public FlyBehavior flyBehavior;

    public Duck() {

    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void display() {
        System.out.println("Duck display!");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
