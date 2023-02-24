package Bridge1;

//concreteimplemetor
public class DefaultMCF implements MorseCodeFuction {

    @Override
    public void dot() {
        System.out.print(".");
    }

    @Override
    public void dash() {
        System.out.print("-");
    }

    @Override
    public void space() {
        System.out.print(" ");
    }
}
