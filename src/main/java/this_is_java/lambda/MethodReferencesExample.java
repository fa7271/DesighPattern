package this_is_java.lambda;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        operator = (x,y) -> Calculator.staticMethod(x, y);
        System.out.println("result1 : " + operator.applyAsInt(1,2));

        operator =Calculator:: staticMethod;
        System.out.println("result2 : " + operator.applyAsInt(1,2));

        Calculator obj = new Calculator();
        operator = (x, y) -> obj.instanceMethod(1, 2);
        System.out.println("result3 : " + operator.applyAsInt(1, 2));

        operator = obj::instanceMethod;
        System.out.println("result4 : " + operator.applyAsInt(1,2));
    }
}
