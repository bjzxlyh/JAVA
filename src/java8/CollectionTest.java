package java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class CollectionTest {
    public static void main(String[] args) {
        CollectionTest co = new CollectionTest();
        co.test1();

    }

    public void test1() {
        Collection coll = new ArrayList();

        coll.add("A");
        coll.add("B");
        coll.add(123);
        coll.add(new Date());
        System.out.println(coll.size());

        Collection coll1 = new ArrayList();
        coll1.add(234);
        coll1.add("SS");
        coll.addAll(coll1);
        System.out.println(coll.size());
        System.out.println(coll);

        System.out.println(coll.isEmpty());
        coll.clear();
        System.out.println(coll.isEmpty());

        coll.add(new String("TOM"));
        coll.add(false);

        //contains(object obj):
        boolean contains = coll.contains(123);

        coll.remove(123);

        System.out.println(coll);
    }
}
