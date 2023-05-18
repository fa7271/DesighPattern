package this_is_java.Rectangle;

public class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        System.out.println("Shape 생성자 호출");
        this.x = x;
        this.y = y;
        System.out.println("Shape :" +"x = " + this.x+", y =" + this.y);
    }
}
