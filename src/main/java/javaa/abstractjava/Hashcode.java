package javaa.abstractjava;

import java.util.Objects;

public class Hashcode {
    public static void main(String[] args) {
        Student student1 = new Student(1,"송보석");
        Student student2 = new Student(1,"송보석");

        System.out.println(student1.hashCode());
        System.out.println(Objects.hashCode(student2));
    }
    static class Student{
        int sno;
        String name;

        Student(int sno, String name) {
            this.sno = sno;
            this.name = name;
        }

        public int hashCode() {
            return Objects.hash(sno, name);
        }
    }
}
