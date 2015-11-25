package module.factories.examples.pizza.domain;

/**
 * Created by Povilas on 2015.08.10.
 */
public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        /*this.name = "Chicago Deep Dish Veggie Pizza";
        this.dough = "Extra Thick Crust Dough";
        this.sauce = "Plum Tomato Sauce";
        this.toppings.add("Shredded Mozzarella Cheese");
        this.toppings.add("Black Olives");
        this.toppings.add("Spinach");
        this.toppings.add("Eggplant");*/
    }

    @Override
    public void prepare() {

    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}