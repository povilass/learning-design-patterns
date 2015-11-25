package module.version2;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = this.pancakeHouseMenu.createIterator();
        Iterator dinerIterator = this.dinerMenu.createIterator();
        Iterator cafeIterator = this.cafeMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        this.printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        this.printMenu(cafeIterator);
        System.out.println("\nDINNER");
        this.printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }

    }

    public void printVegetarianMenu() {
        System.out.println("\nVEGETARIAN MENU\n---------------");
        this.printVegetarianMenu(this.pancakeHouseMenu.createIterator());
        this.printVegetarianMenu(this.dinerMenu.createIterator());
        this.printVegetarianMenu(this.cafeMenu.createIterator());
    }

    public boolean isItemVegetarian(String name) {
        Iterator pancakeIterator = this.pancakeHouseMenu.createIterator();
        if(this.isVegetarian(name, pancakeIterator)) {
            return true;
        } else {
            Iterator dinerIterator = this.dinerMenu.createIterator();
            if(this.isVegetarian(name, dinerIterator)) {
                return true;
            } else {
                Iterator cafeIterator = this.cafeMenu.createIterator();
                return this.isVegetarian(name, cafeIterator);
            }
        }
    }

    private void printVegetarianMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            if(menuItem.isVegetarian()) {
                System.out.print(menuItem.getName() + ", ");
                System.out.print(menuItem.getPrice() + " -- ");
                System.out.println(menuItem.getDescription());
            }
        }

    }

    private boolean isVegetarian(String name, Iterator iterator) {
        MenuItem menuItem;
        do {
            if(!iterator.hasNext()) {
                return false;
            }

            menuItem = (MenuItem)iterator.next();
        } while(!menuItem.getName().equals(name) || !menuItem.isVegetarian());

        return true;
    }
}