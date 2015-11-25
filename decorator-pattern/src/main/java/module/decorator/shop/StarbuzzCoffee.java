package module.decorator.shop;

import module.decorator.shop.condiment.DarkRoast;
import module.decorator.shop.condiment.Espresso;
import module.decorator.shop.condiment.HouseBlend;
import module.decorator.shop.condiment.decorated.Mocha;
import module.decorator.shop.condiment.decorated.Soy;
import module.decorator.shop.condiment.decorated.Whip;

/**
 * Created by Povilas on 2015.07.29.
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.TALL);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
