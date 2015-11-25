package module.decorator.shop.condiment.decorated;

import module.decorator.shop.Beverage;
import module.decorator.shop.CondimentDecorator;

/**
 * Created by Povilas on 2015.07.29.
 */
public class Mocha extends CondimentDecorator {

    public Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
