package Bridge1;

//abstraction 기능부분
public class MorseCode {
    private MorseCodeFuction fuction;

    public void setFuction(MorseCodeFuction fuction) {
        this.fuction = fuction;
    }

    public MorseCode(MorseCodeFuction fuction) {
        this.fuction = fuction;
    }

    public void dot() {
        fuction.dot();
        System.out.print("."); // 다른곳에서 구현하면 간편하게 된다.
    }
    public void dash() {
        fuction.dash();
        System.out.print("-");
    }

    public void space() {
        fuction.space();
        System.out.print(" ");
    }
}
