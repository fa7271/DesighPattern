package this_is_java.Yield;

public class ThreadA extends Thread{
    public boolean stop = false;
    public boolean work = true;

    public void run() {
        while (!stop) {
            if (work) {
                System.out.println("A 작업중");
            }
            else{
                Thread.yield();
            }
        }
        System.out.println("A 끝");
    }
}
