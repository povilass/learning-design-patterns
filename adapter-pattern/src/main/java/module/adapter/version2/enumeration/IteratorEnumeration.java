package module.adapter.version2.enumeration;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration {
    Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    public boolean hasMoreElements() {
        return this.iterator.hasNext();
    }

    public Object nextElement() {
        return this.iterator.next();
    }
}