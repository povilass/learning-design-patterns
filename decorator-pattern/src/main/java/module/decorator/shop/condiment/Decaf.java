package module.decorator.shop.condiment;

import module.decorator.shop.Beverage;

/**
 * Created by Povilas on 2015.07.29.
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
