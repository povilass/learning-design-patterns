package module.decorator.shop.condiment.decorated;

import module.decorator.shop.Beverage;
import module.decorator.shop.CondimentDecorator;

/**
 * Created by Povilas on 2015.07.29.
 */
public class SteamedMilk extends CondimentDecorator {

    public Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}