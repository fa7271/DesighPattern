package this_is_java.Extends;

public class Child extends Parent {
    private int value2;

    public Child(int value, int value2) {
        super(value); // 부모 클래스의 생성자 호출
        this.value2 = value2;
    }

    public int getValue2() {
        return value2;
    }
}