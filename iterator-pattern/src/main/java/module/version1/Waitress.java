package module.version1;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
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
        this.printVegetarianMenu(this.pancakeHouseMenu.createIterator());
        this.printVegetarianMenu(this.dinerMenu.createIterator());
    }

    public boolean isItemVegetarian(String name) {
        Iterator breakfastIterator = this.pancakeHouseMenu.createIterator();
        if(this.isVegetarian(name, breakfastIterator)) {
            return true;
        } else {
            Iterator dinnerIterator = this.dinerMenu.createIterator();
            return this.isVegetarian(name, dinnerIterator);
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