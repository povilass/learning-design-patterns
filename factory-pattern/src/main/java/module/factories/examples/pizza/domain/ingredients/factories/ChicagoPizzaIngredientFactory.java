package module.factories.examples.pizza.domain.ingredients.factories;

import module.factories.examples.pizza.domain.ingredients.*;
import module.factories.examples.pizza.domain.ingredients.cheese.Mozzarella;
import module.factories.examples.pizza.domain.ingredients.clams.FrozenClam;
import module.factories.examples.pizza.domain.ingredients.dough.ThickCrustDough;
import module.factories.examples.pizza.domain.ingredients.pepperoni.SlicedPepperoni;
import module.factories.examples.pizza.domain.ingredients.sauce.PlumTomatoSauce;
import module.factories.examples.pizza.domain.ingredients.veggies.BlackOlives;
import module.factories.examples.pizza.domain.ingredients.veggies.EggPlant;
import module.factories.examples.pizza.domain.ingredients.veggies.Spinach;

/**
 * Created by Povilas on 2015.08.19.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new Mozzarella();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(), new Spinach(), new EggPlant()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClams() {
        return new FrozenClam();
    }
}
