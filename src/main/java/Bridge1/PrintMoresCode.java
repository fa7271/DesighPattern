package Bridge1;

// 기능 부분
public class PrintMoresCode extends MorseCode{

    public PrintMoresCode(MorseCodeFuction fuction) {
        super(fuction);
    }

    public PrintMoresCode g() {
        dash();dash();dot();space();
        return this;
    }

    public PrintMoresCode a() {
        dot();dash();space();
        return this;
    }

    public PrintMoresCode r() {
        dot();dash();dash();space();
        return this;
    }

    public PrintMoresCode m() {
        dash();dash();space();
        return this;
    }
}
