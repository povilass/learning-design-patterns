package module.factories.examples.pizza.domain.ingredients.factories;

import module.factories.examples.pizza.domain.ingredients.*;
import module.factories.examples.pizza.domain.ingredients.cheese.ReggianoCheese;
import module.factories.examples.pizza.domain.ingredients.clams.FreshClams;
import module.factories.examples.pizza.domain.ingredients.dough.ThinCrustDough;
import module.factories.examples.pizza.domain.ingredients.pepperoni.SlicedPepperoni;
import module.factories.examples.pizza.domain.ingredients.sauce.MarinaraSauce;
import module.factories.examples.pizza.domain.ingredients.veggies.Garlic;
import module.factories.examples.pizza.domain.ingredients.veggies.Mushroom;
import module.factories.examples.pizza.domain.ingredients.veggies.Onion;
import module.factories.examples.pizza.domain.ingredients.veggies.RedPepper;

/**
 * Created by Povilas on 2015.08.19.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return new Veggies[0];
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClams() {
        return new FreshClams();
    }
}
