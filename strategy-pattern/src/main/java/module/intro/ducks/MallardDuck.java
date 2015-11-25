package module.intro.ducks;

import module.intro.behavior.fly.FlyWithWings;
import module.intro.behavior.quack.Quack;

/**
 * Created by Povilas on 2015.06.25.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
