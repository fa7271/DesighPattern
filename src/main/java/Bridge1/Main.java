package Bridge1;

public class Main {
    public static void main(String[] args) {
        PrintMoresCode code = new PrintMoresCode(new SoundMCF());

//        code.g();code.a();code.r();code.a();code.m();
        code.g().a().r().a().m(); // 체이닝


    }
}
