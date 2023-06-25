package abstractfactory.gui.factory;

import abstractfactory.gui.button.Button;
import abstractfactory.gui.button.WindowsButton;
import abstractfactory.gui.checkbox.Checkbox;
import abstractfactory.gui.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

}
