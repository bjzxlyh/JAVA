package java8;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
          SetTest s = new SetTest();
          s.test();
    }

    public void test(){
        Set set = new HashSet();
        set.add(123);
        set.add(789);
        set.add("ads");
        set.add(new String("TOM"));

        System.out.println(set);
    }


}
