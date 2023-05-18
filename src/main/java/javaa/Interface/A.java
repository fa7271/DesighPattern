package javaa.Interface;

public class A {
    final int a = 1;
    int b = 2;

    void outMethod(final int a, int b) {
        final int c = 1;
        int d = 2;
        class LocalClass {
            void method() {
                int result = a+b+c+d;
            }
        }

    }
    public static void main(String[] args) {

    }
}
