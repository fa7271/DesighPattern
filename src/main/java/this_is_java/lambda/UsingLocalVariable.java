package this_is_java.lambda;

public class UsingLocalVariable {
    void method(int arg) {
        int localVar = 40;

//        final int arg = 31;
//        final int localVar = 41;

        MyFunctionInterface fi = ()->{
            System.out.println("args : "+ arg);
            System.out.println("localVar = " + localVar);
        };
        fi.method();
    }
}
