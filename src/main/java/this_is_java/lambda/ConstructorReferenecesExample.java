package this_is_java.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferenecesExample {
    public static void main(String[] args) {
        Function<String, Member> function1 = Member::new;
        Member member1 = function1.apply("angel");

        BiFunction<String, String, Member> function2 = Member::new;
        function2.apply("송보석", "angel");

    }
}
