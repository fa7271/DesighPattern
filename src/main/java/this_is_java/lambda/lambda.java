package this_is_java.lambda;

public class lambda {

    public static void main(String[] args) {
        MyFunctionInterface myFunctionInterface;
//        Runnable ex1 = new Runnable(){
//            public void run() {
//                System.out.println("s");
//            }
//        };
//        Runnable  ex2 =() ->{
//            System.out.println("d");
//        };
//        Runnable ex3 = System.out::println;
//
//        MyFunctionInterface fi = ()->{
//            String str = "method call";
//            System.out.println(str);
//        };

//        noReturn =(x)->{
//            int result = x * 5;
//            System.out.println(result);
//        };
//        noReturn.method(2);
//
//        noReturn = (x)->{
//            System.out.println(x*5);
//        };
//        noReturn.method(2);
//
//        noReturn = x -> System.out.println(x * 5);
//        noReturn.method(3);
        UsingLocalVariable ulv = new UsingLocalVariable();
        ulv.method(10);
    }
}
