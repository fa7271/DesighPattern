package this_is_java.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FuctionExample {
    private static List<Student> list = Arrays.asList(
            new Student("송보석",1,2),
            new Student("송은아",3,4)
    );

    public static double avg(ToIntFunction<Student> function){
        int sum = 0;
        for (Student student : list) {
            sum += function.applyAsInt(student);
        }
        double avg = (double)sum / list.size();
        return avg;
    }

    List<Student> list2 = Arrays.asList( // 인스턴스
            new Student("송보석2", 1, 2),
            new Student("송은아2", 3, 4)
    );
    public double avg2(ToIntFunction<Student> function){ // 정적
        int sum = 0;
        for (Student student : list2) {
            sum += function.applyAsInt(student);
        }
        double avg = (double)sum / list2.size();
        return avg;
    }

    public static void main(String[] args) {
        double englishAvg = avg(s -> s.getEnglishScore());
        System.out.println("englishAvg = " + englishAvg);

        double mathAvg = avg(s -> s.getMathScore());
        System.out.println("mathAvg = " + mathAvg);
    }
}
