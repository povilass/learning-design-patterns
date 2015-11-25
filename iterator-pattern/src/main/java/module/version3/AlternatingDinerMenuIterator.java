package module.version3;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        Calendar rightNow = Calendar.getInstance();
        this.position = 7 % 2;
    }

    public Object next() {
        MenuItem menuItem = this.items[this.position];
        this.position += 2;
        return menuItem;
    }

    public boolean hasNext() {
        return this.position < this.items.length && this.items[this.position] != null;
    }

    public void remove() {
        throw new UnsupportedOperationException("Alternating Diner Menu Iterator does not support remove()");
    }
}