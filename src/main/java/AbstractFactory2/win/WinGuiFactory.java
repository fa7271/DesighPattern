package AbstractFactory2.win;

import AbstractFactory2.abs.Button;
import AbstractFactory2.abs.GuiFactory;
import AbstractFactory2.abs.TextArea;
import AbstractFactory2.mac.MacButton;
import AbstractFactory2.mac.MacTextArea;

public class WinGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextArea createTextArea() {
        return new WinTextArea();
    }
}
