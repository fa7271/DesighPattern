package javaa.abstractjava;

public class Person {

    private String name;        // 인스턴스 변수
    private final double radius;

    private static int count;   // 클래스 변수 (static 필드)
    private static final int MAX_AGE = 100;  // 클래스 상수 (static final 필드)

    public Person(String name) {
        this.name = name;
        count++;  // 클래스 변수 값 증가
        this.radius = 0.0;
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        Person p2 = new Person("Bob");

        System.out.println(p1.getName());    // "Alice"
        System.out.println(p2.getName());    // "Bob"
        System.out.println(Person.getCount());   // 2
        System.out.println(Person.MAX_AGE);  // 100
    }
}