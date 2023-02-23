package AbstractFactory2.mac;

import AbstractFactory2.abs.Button;
import AbstractFactory2.abs.GuiFactory;
import AbstractFactory2.abs.TextArea;

public class Main {
    public static void main(String[] args) {
        GuiFactory factory = new MacGuiFactory();

        Button button = factory.createButton();
        TextArea textArea = factory.createTextArea();

        System.out.println("textArea = " + textArea.getText());
        button.click();

    }
}
