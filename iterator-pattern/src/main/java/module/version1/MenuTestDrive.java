package module.version1;

import java.util.ArrayList;

public class MenuTestDrive {
    public MenuTestDrive() {
    }

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }

    public static void printMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();

        for(int lunchItems = 0; lunchItems < breakfastItems.size(); ++lunchItems) {
            MenuItem i = (MenuItem)breakfastItems.get(lunchItems);
            System.out.print(i.getName());
            System.out.println("\t\t" + i.getPrice());
            System.out.println("\t" + i.getDescription());
        }

        MenuItem[] var6 = dinerMenu.getMenuItems();

        for(int var7 = 0; var7 < var6.length; ++var7) {
            MenuItem menuItem = var6[var7];
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }

    }
}