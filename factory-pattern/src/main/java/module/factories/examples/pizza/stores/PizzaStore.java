package module.factories.examples.pizza.stores;

import module.factories.examples.pizza.domain.Pizza;
import module.factories.examples.pizza.factory.SimplePizzaFactory;

/**
 * Created by Povilas on 2015.08.10.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);

}
