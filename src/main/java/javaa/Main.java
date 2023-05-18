package javaa;


import javaa.abstractjava.smatPhone;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        smatPhone myPhone = new smatPhone("구글", "안드로이드");
        String obj = myPhone.toString();
        String s = obj.toString();
        String[] name = {"A","B","F","C"};
        Arrays.sort(name);
//        for (String s1 : name) {
//            System.out.println(s1);
//        }

        Arrays.stream(name).forEach(x -> System.out.println(x));
        Arrays.stream(name).forEach(System.out::println);
    }

}