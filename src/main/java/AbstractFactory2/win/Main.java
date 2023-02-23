package AbstractFactory2.win;

import AbstractFactory2.abs.Button;
import AbstractFactory2.abs.GuiFactory;
import AbstractFactory2.abs.TextArea;
import AbstractFactory2.concrete.FactoryInstance;

public class Main {
    public static void main(String[] args) {
        GuiFactory factory = FactoryInstance.getGuiFac();

        Button button = factory.createButton();
        TextArea textArea = factory.createTextArea();

        System.out.println("textArea = " + textArea.getText());
        button.click();

    }
}
