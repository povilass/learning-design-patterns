package module.factories.examples.pizza.domain;

import module.factories.examples.pizza.domain.ingredients.factories.PizzaIngredientFactory;

/**
 * Created by Povilas on 2015.08.10.
 */
public class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        clam = ingredientFactory.createClams();
    }
}
