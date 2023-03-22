package Visitor;

public class VisitableA implements Visitable {

    int numberOfMember;

    public VisitableA(int numberOfMember) {
        System.out.println("3");
        this.numberOfMember = numberOfMember;
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println("4");
        visitor.visit(this);
    }
}