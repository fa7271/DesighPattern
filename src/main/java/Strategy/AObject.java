package Strategy;

public class AObject {

    Ainterface ainterface;

    public AObject() {
        ainterface = new AinterfaceImpl();
    }
    public void funcAA() {

        ainterface.funcA(); // 책임을 떠넘김 ainterface 에게 넘김
        ainterface.funcA();

//        System.out.println("AAA");
//        System.out.println("AAA");

        // ~ 기능이 필요
    }
}
