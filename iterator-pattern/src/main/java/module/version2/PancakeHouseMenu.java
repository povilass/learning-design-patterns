package module.version2;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems = new ArrayList();

    public PancakeHouseMenu() {
        this.addItem("K&B\'s Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99D);
        this.addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99D);
        this.addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries, and blueberry syrup", true, 3.49D);
        this.addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59D);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return this.menuItems;
    }

    public Iterator createIterator() {
        return this.menuItems.iterator();
    }
}