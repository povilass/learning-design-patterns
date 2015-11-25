package module.decorator.shop.condiment.decorated;

import module.decorator.shop.Beverage;
import module.decorator.shop.CondimentDecorator;

/**
 * Created by Povilas on 2015.07.29.
 */
public class Soy extends CondimentDecorator {

    public Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public Size getSize() {
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        switch (beverage.getSize()) {
            case TALL : {
                cost += .10;
                break;
            }
            case GRANDE:{
                cost += .15;
                break;
            }
            case VENTI:{
                cost += .20;
                break;
            }
        }
        return cost;
    }
}
