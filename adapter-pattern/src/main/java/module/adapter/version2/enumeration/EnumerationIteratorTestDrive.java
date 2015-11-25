package module.adapter.version2.enumeration;

import java.util.Arrays;
import java.util.Collection;
import java.util.Vector;

public class EnumerationIteratorTestDrive {
    public EnumerationIteratorTestDrive() {
    }

    public static void main(String[] args) {
        Vector v = new Vector((Collection) Arrays.asList(args));
        EnumerationIterator iterator = new EnumerationIterator(v.elements());

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}