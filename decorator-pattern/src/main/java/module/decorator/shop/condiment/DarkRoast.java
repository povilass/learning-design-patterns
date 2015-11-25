package module.decorator.shop.condiment;

import module.decorator.shop.Beverage;

/**
 * Created by Povilas on 2015.07.29.
 */
public class DarkRoast  extends Beverage {
    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
