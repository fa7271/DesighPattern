package Bridge1;

//concreteimplemetor
public class SoundMCF implements MorseCodeFuction {

    @Override
    public void dot() {
        System.out.print("점");
    }

    @Override
    public void dash() {
        System.out.print("선");
    }

    @Override
    public void space() {
        System.out.print(" ");
    }
}
