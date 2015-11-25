package module.version2;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        this.addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99D);
        this.addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69D);
        this.addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29D);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItems.put(menuItem.getName(), menuItem);
    }

    public Hashtable getItems() {
        return this.menuItems;
    }

    public Iterator createIterator() {
        return this.menuItems.values().iterator();
    }
}