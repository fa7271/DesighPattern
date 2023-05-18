package this_is_java.Yield;

public class YeldExample {

    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        threadA.start();
        threadB.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
        threadA.work = false;

        System.out.println("a,b둘다 실행");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
        threadA.work = true;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
        threadA.stop = true;
        threadB.stop = true;
        System.out.println("a,b둘다 종료");
    }
}
