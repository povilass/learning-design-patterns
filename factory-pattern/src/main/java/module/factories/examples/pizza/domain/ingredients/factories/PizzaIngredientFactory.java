package module.factories.examples.pizza.domain.ingredients.factories;

import module.factories.examples.pizza.domain.ingredients.*;

/**
 * Created by Povilas on 2015.08.19.
 */
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();
}
