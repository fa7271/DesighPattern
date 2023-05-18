package javaa.who;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {

        HashMap<Key, String> hashMap = new HashMap<>();

        hashMap.put(new Key(1), "송보석");

        String value = hashMap.get(new Key(1));

        System.out.println(value);

    }
}
