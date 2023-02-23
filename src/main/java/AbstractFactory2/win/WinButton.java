package AbstractFactory2.win;

import AbstractFactory2.abs.Button;

public class WinButton implements Button {
    @Override
    public void click() {
        System.out.println("win button");
    }
}
