package javaa.thread;

public class Main {
    public static void main(String[] args) {
        BeepTask beepTask = new BeepTask();

        Thread thread = new Thread(beepTask);
        thread.start(); // 작업 스레드 호출

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");

            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
