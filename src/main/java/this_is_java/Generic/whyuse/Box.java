package this_is_java.Generic.whyuse;

import java.util.Objects;

public class Box<T> {
    private T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}
