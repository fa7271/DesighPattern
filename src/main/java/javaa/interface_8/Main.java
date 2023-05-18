package javaa.interface_8;

public class Main {
    public static void main(String[] args) {
        Annoymous annoy = new Annoymous();

        annoy.field.turnon();
        annoy.method1();
        annoy.method2(
                new RemoteControl() {
            @Override
            public void turnon() {
                System.out.println("스마트 티비 켬");
            }
            @Override
            public void turnoff() {
                System.out.println("스마트티비끔 ");
            }
        }
        );
    }
}