package Visitor;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        ArrayList<Visitable> as = new ArrayList<Visitable>();
        System.out.println("start");
        as.add(new VisitableA(1));
        as.add(new VisitableA(2));
//        as.add(new VisitableA(3));
//        as.add(new VisitableA(4));
//        as.add(new VisitableA(5));
        System.out.println("1");
        VisitorA visitor = new VisitorA();
        System.out.println("2");
        for (Visitable va : as) {
            System.out.println("for");
            va.accept(visitor);
        }
//        System.out.println(visitor.getNumber());
    }
}
