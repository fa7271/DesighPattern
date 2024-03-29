package this_is_java.Generic.whyuse;

public class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K,V> p2){
        boolean keyCompare = p1.getKey().equals(p2.getKey());
        boolean valueCompare = p1.getValue().equals(p2.getValue());

        return keyCompare&&valueCompare;
    }

    public static <T extends Number> int compares(T t1, T t2) {
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        int v3 = t2.intValue();
        return Double.compare(v1, v2);

    }
}
