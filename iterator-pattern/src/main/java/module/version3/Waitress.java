package module.version3;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = this.pancakeHouseMenu.createIterator();
        Iterator dinerIterator = this.dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        this.printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
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
        System.out.println("\nVEGETARIAN MENU\n----\nBREAKFAST");
        this.printVegetarianMenu(this.pancakeHouseMenu.createIterator());
        System.out.println("\nLUNCH");
        this.printVegetarianMenu(this.dinerMenu.createIterator());
    }

    public boolean isItemVegetarian(String name) {
        Iterator pancakeIterator = this.pancakeHouseMenu.createIterator();
        if(this.isVegetarian(name, pancakeIterator)) {
            return true;
        } else {
            Iterator dinerIterator = this.dinerMenu.createIterator();
            return this.isVegetarian(name, dinerIterator);
        }
    }

    private void printVegetarianMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            if(menuItem.isVegetarian()) {
                System.out.print(menuItem.getName());
                System.out.println("\t\t" + menuItem.getPrice());
                System.out.println("\t" + menuItem.getDescription());
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