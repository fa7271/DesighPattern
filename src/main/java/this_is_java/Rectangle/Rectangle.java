package this_is_java.Rectangle;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y); // Shape의 생성자 호출
        this.width = width;
        this.height = height;
    }

    public double calaArea() {
        return this.width * this.height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 10, 30, 30);
        System.out.println("Rectangle 면적은 " +rectangle.calaArea());
    }
}



