package abstractfactory.gui.factory;

import abstractfactory.gui.button.Button;
import abstractfactory.gui.button.MacOSButton;
import abstractfactory.gui.checkbox.Checkbox;
import abstractfactory.gui.checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }

}
