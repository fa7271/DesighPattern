package AbstractFactory2;

import AbstractFactory2.abs.Button;
import AbstractFactory2.abs.GuiFactory;
import AbstractFactory2.abs.TextArea;
import AbstractFactory2.concrete.FactoryInstance;

public class Main {
    public static void main(String[] args) {
        GuiFactory guiFac = FactoryInstance.getGuiFac();
        Button button = guiFac.createButton();
        TextArea textArea = guiFac.createTextArea();

        button.click();
        System.out.println("textArea = " + textArea.getText());
        System.out.println(System.getProperty("os.name"));
    }
}
