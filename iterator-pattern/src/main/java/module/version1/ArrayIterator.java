package module.version1;

public class ArrayIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public ArrayIterator(MenuItem[] items) {
        this.items = items;
    }

    public Object next() {
        MenuItem menuItem = this.items[this.position];
        ++this.position;
        return menuItem;
    }

    public boolean hasNext() {
        return this.position < this.items.length && this.items[this.position] != null;
    }
}