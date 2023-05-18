package this_is_java.Treeset;

public class Person implements Comparable<Person> {
    public String name;
    public int ang;
    public Person(String name, int ang) {
        this.name = name;
        this.ang = ang;
    }
    @Override
    public int compareTo(Person o) {
        System.out.println(ang+":"+o.ang);
        if (ang<o.ang) return -1;
        else if (ang == o.ang) return 0;
        else return 1;
    }
}
