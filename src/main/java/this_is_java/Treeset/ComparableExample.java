package this_is_java.Treeset;

import java.util.Iterator;
import java.util.TreeSet;


public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeset = new TreeSet<Person>();

        treeset.add(new Person("송보석" ,11));
        treeset.add(new Person("송보석" ,12));
        treeset.add(new Person("송보석" ,25));
        treeset.add(new Person("송보석" ,1));
        treeset.add(new Person("송보석" ,202));

        Iterator<Person> iterator = treeset.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            System.out.println(p.name +"="+ p.ang);
        }
    }
}