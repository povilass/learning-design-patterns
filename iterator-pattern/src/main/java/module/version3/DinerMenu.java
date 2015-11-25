package module.version3;

import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems = new MenuItem[6];

    public DinerMenu() {
        this.addItem("Vegetarian BLT", "(Fakin\') Bacon with lettuce & tomato on whole wheat", true, 2.99D);
        this.addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99D);
        this.addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29D);
        this.addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05D);
        this.addItem("Steamed Veggies and Brown Rice", "Steamed vegetables over brown rice", true, 3.99D);
        this.addItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89D);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(this.numberOfItems >= 6) {
            System.err.println("Sorry, menu is full!  Can\'t add item to menu");
        } else {
            this.menuItems[this.numberOfItems] = menuItem;
            ++this.numberOfItems;
        }

    }

    public MenuItem[] getMenuItems() {
        return this.menuItems;
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(this.menuItems);
    }
}