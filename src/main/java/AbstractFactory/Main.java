package AbstractFactory;

import AbstractFactory.Gt.GtBikeFactory;
import AbstractFactory.Sam.SamFactory;
import AbstractFactory.abs.BikeFactory;
import AbstractFactory.abs.Body;
import AbstractFactory.abs.Wheel;

public class Main {
    public static void main(String[] args) {
//        BikeFactory factory = new SamFactory();
        BikeFactory factory = new GtBikeFactory();

        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();

        System.out.println("body.getClass() = " + body.getClass());
        System.out.println("wheel.getClass() = " + wheel.getClass());

    }
}
