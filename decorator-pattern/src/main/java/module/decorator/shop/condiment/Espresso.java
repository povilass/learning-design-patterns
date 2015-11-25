package module.decorator.shop.condiment;

import module.decorator.shop.Beverage;

/**
 * Created by Povilas on 2015.07.29.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
