package java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iteratortest {
    public static void main(String[] args) {
        Iteratortest a = new Iteratortest();
        a.test();
    }
    public void test(){
        Collection coll = new ArrayList();

        coll.add("A");
        coll.add("B");
        coll.add(123);


       Iterator iter = coll.iterator();
       System.out.println(iter.next());
       System.out.println(iter.hasNext());
   }



}

