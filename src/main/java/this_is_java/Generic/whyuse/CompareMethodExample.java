package this_is_java.Generic.whyuse;

public class CompareMethodExample {
    public static void main(String[] args) {
        Pair<String, String> p3 = new Pair<>("user1", "홍길동");
        Pair<String, String> p4 = new Pair<>("user2", "홍길동");

        boolean compare = Util.compare(p3, p4);
        if (compare) {
            System.out.println("동등");
        }else {
            System.out.println("안 동등");
        }
    }
}
