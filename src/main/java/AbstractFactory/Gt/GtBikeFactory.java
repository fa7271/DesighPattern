package AbstractFactory.Gt;

import AbstractFactory.abs.BikeFactory;
import AbstractFactory.abs.Body;
import AbstractFactory.abs.Wheel;

public class GtBikeFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
