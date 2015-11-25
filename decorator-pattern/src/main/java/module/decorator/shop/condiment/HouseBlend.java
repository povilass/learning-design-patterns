package module.decorator.shop.condiment;

import module.decorator.shop.Beverage;

/**
 * Created by Povilas on 2015.07.29.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
