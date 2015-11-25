package module.factories.examples.pizza.domain;

/**
 * Created by Povilas on 2015.08.10.
 */
public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        /*this.name = "Chicago Style Pepperoni Pizza";
        this.dough = "Extra Thick Crust Dough";
        this.sauce = "Plum Tomato Sauce";
        this.toppings.add("Shredded Mozzarella Cheese");
        this.toppings.add("Black Olives");
        this.toppings.add("Spinach");
        this.toppings.add("Eggplant");
        this.toppings.add("Sliced Pepperoni");*/
    }

    @Override
    public void prepare() {

    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}