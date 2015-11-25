package module.factories.examples.pizza.domain;

import com.sun.org.apache.xpath.internal.SourceTree;
import module.factories.examples.pizza.domain.ingredients.*;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Povilas on 2015.08.10.
 */
public abstract class Pizza {

    public String name;

    public Dough dough;

    public Sauce sauce;

    public Veggies veggies[];

    public Cheese cheese;

    public Pepperoni pepperoni;

    public Clams clam;


    public abstract void prepare();

    public void bake() {
        System.out.println("Baking for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
