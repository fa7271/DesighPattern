package AbstractFactory.Sam;

import AbstractFactory.abs.BikeFactory;
import AbstractFactory.abs.Body;
import AbstractFactory.abs.Wheel;

public class SamFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new Sambody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
