package AbstractFactory2.mac;

import AbstractFactory2.abs.Button;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("mac button");
    }
}
