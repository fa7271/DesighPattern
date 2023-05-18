package javaa.abstractjava;

public class javaa {



    private static int gas;

    public void setGas(int gas) {
        this.gas = gas;
    }
    void run2() {
        for (int i = 10; i <= 50; i += 10) {
            this.setGas(i);
            System.out.println("i = " + i);
        }
    }

    static int area(int width) {
        return width;
    }
    static int are2(int width) {
        return width;
    }
    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("gas = " + gas);
                gas -= 1;

            }
            else {
                System.out.println("gas잔량 = " + gas);
                return;
            }
        }
    }

    public static void main(String[] args) {
        javaa a = new javaa();
        a.run2();
        a.are2(5);
        a.area(5);
//        a.setGas(5);
//        a.run();
    }
}
