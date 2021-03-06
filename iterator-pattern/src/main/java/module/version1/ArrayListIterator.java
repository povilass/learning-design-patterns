package module.version1;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator {
    ArrayList items;
    int position = 0;

    public ArrayListIterator(ArrayList items) {
        this.items = items;
    }

    public Object next() {
        Object object = this.items.get(this.position);
        ++this.position;
        return object;
    }

    public boolean hasNext() {
        return this.position < this.items.size();
    }
}