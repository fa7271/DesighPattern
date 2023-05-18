package javaa.Interface;

public interface ParentIn {
    public void method1();

    public default void method2() {
        System.out.println("부모 디폴트메소드");
    }
}
