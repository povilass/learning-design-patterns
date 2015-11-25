package module.version1;

import java.util.Calendar;

public class AlternatingDinerMenuIterator implements Iterator {
    MenuItem[] list;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] list) {
        this.list = list;
        Calendar rightNow = Calendar.getInstance();
        this.position = 7 % 2;
    }

    public Object next() {
        MenuItem menuItem = this.list[this.position];
        this.position += 2;
        return menuItem;
    }

    public boolean hasNext() {
        return this.position < this.list.length && this.list[this.position] != null;
    }

    public String toString() {
        return "Alternating Diner Menu Iterator";
    }
}