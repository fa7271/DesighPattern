package Adapter;

public class AdapterImpl implements Adapter{


    @Override
    public Float twiceOf(Float f) {
        return Math.doubled(f.doubleValue()).floatValue();
//        f를 double 로 바꾸고 return 할때 float 으로
    }

    @Override
    public Float halfOf(Float f) {
        return (float) Math.half(f.doubleValue());

    }
}
