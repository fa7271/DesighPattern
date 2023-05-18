package this_is_java;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");

        String[] stringArray = stringList.toArray(new String[0]);
        System.out.println("stringArray = " + stringArray);
        System.out.println(stringArray[0]);
    }
}
