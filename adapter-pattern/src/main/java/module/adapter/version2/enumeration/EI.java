package module.adapter.version2.enumeration;

import java.util.*;

public class EI {
    public EI() {
    }

    public static void main(String[] args) {
        Vector v = new Vector((Collection) Arrays.asList(args));
        Enumeration enumeration = v.elements();

        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        Iterator iterator = v.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}