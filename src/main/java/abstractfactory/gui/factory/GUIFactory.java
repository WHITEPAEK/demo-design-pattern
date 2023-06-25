package abstractfactory.gui.factory;

import abstractfactory.gui.button.Button;
import abstractfactory.gui.checkbox.Checkbox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();

}
