package module.intro;

import module.intro.behavior.fly.FlyRocketPowered;
import module.intro.ducks.Duck;
import module.intro.ducks.MallardDuck;
import module.intro.ducks.ModelDuck;

/**
 * Created by Povilas on 2015.06.25.
 */
public class MiniDuckSimulator {


    /*
    * Strategy pattern - defines a famaly of algorithms,
    * encapsulates each one, and makes them interchangeable.
    * Strategy lets the algorithm vary independently clients that use it.
    */

    public static void main(String args[]) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
