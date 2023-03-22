package Visitor;


public class VisitorA implements Visitor {

    private int number;

    public VisitorA() {
        this.number = 0;
    }

    @Override
    public void visit(Visitable visitable) { // accept에서 넘어온 애들
        System.out.println("5");
        if(visitable instanceof VisitableA){ // 방문을 하면 number 를 더해준다.
            number+=((VisitableA) visitable).numberOfMember;
        }else {
            //...
        }
    }

    public int getNumber() {
        System.out.println("6");
        return number;
    }

    public void setNumber(int number) {
        System.out.println("7");
        this.number = number;
    }
}
