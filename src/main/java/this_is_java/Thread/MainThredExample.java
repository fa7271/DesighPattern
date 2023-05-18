package this_is_java.Thread;

public class MainThredExample {
    public static void main(String[] args) {
        Calculator calulator = new Calculator();

        User1 user1 = new User1();
        user1.setCalculator(calulator);
        user1.start();

        User2 user2 = new User2();
        user2.setCalculator(calulator);
        user2.start();
    }
}
