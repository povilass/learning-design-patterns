package module.intro.ducks;

import module.intro.behavior.fly.FlyNoWay;
import module.intro.behavior.fly.FlyWithWings;
import module.intro.behavior.quack.Quack;

/**
 * Created by Povilas on 2015.06.26.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("Model Duck display");
    }
}
