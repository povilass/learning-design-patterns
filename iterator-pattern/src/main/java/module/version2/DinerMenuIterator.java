package module.version2;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }

    public Object next() {
        MenuItem menuItem = this.list[this.position];
        ++this.position;
        return menuItem;
    }

    public boolean hasNext() {
        return this.position < this.list.length && this.list[this.position] != null;
    }

    public void remove() {
        if(this.position <= 0) {
            throw new IllegalStateException("You can\'t remove an item until you\'ve done at least one next()");
        } else {
            if(this.list[this.position - 1] != null) {
                for(int i = this.position - 1; i < this.list.length - 1; ++i) {
                    this.list[i] = this.list[i + 1];
                }

                this.list[this.list.length - 1] = null;
            }

        }
    }
}