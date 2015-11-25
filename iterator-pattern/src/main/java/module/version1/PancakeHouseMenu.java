package module.version1;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems = new ArrayList();

    public PancakeHouseMenu() {
        this.addItem("K&B\'s Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99D);
        this.addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99D);
        this.addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49D);
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
        return new PancakeHouseMenuIterator(this.menuItems);
    }

    public String toString() {
        return "Objectville Pancake House Menu";
    }
}