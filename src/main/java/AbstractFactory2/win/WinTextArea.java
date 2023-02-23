package AbstractFactory2.win;

import AbstractFactory2.abs.TextArea;

public class WinTextArea implements TextArea {
    @Override
    public String getText() {
        return "win TextArea";
    }
}
