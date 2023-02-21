package Strategy;

import java.awt.image.Kernel;

public class Main {
    public static void main(String[] args) {
//        AinterfaceImpl ainterface = new AinterfaceImpl();
        //통로가 된다.
//        ainterface.funcA();

//        AObject aObject = new AObject();
//        aObject.funcAA();


        GameCharaceter characeter = new GameCharaceter();

        characeter.attack();

        characeter.setWeapon(new knife());
        characeter.attack();

        characeter.setWeapon(new Sword());
        characeter.attack();
    }
}
