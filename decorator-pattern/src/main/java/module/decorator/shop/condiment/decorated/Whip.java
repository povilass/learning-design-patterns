package module.decorator.shop.condiment.decorated;

import module.decorator.shop.Beverage;
import module.decorator.shop.CondimentDecorator;

/**
 * Created by Povilas on 2015.07.29.
 */
public class Whip extends CondimentDecorator {

    public Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}