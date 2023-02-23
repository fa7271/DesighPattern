package AbstractFactory2.concrete;

import AbstractFactory2.abs.Button;
import AbstractFactory2.abs.GuiFactory;
import AbstractFactory2.abs.TextArea;
import AbstractFactory2.mac.MacGuiFactory;
import AbstractFactory2.win.WinGuiFactory;

public class FactoryInstance {


    public static GuiFactory getGuiFac() {
        switch (getOsCode()){
            case 0 : return new MacGuiFactory();
            case 1 : return new WinGuiFactory();
            case 2 : return new LinuxGuiFac();
        }
        return null;
    }
    private static int getOsCode(){
        if(System.getProperty("os.name").equals("Mac OS X")){
            return 0;
        }
        return 1;
    }

}
class LinuxButton implements Button {
    @Override
    public void click() {
        System.out.println("Linux Button");
    }
}
class LinuxGuiFac implements GuiFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
}
class LinuxTextArea implements TextArea {
    @Override
    public String getText() {
        return "linux TextArea";
    }
}

