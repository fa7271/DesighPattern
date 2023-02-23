package AbstractFactory2.mac;

import AbstractFactory2.abs.Button;
import AbstractFactory2.abs.GuiFactory;
import AbstractFactory2.abs.TextArea;

public class MacGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextArea createTextArea() {
        return new MacTextArea();
    }
}
