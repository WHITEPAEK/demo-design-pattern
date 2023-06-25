package abstractfactory.gui;

import abstractfactory.gui.button.Button;
import abstractfactory.gui.checkbox.Checkbox;
import abstractfactory.gui.factory.GUIFactory;
import abstractfactory.gui.factory.MacOSFactory;
import abstractfactory.gui.factory.WindowsFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GUIFactoryTests {

    @Test
    void windowsFactory_shouldReturnButtonAndCheckboxOfWindows_whenWindowsIsPassed() {
        GUIFactory windows = new WindowsFactory();
        Button button = windows.createButton();
        assertEquals(button.render(), "Rendering a Windows button");
        Checkbox checkbox = windows.createCheckbox();
        assertEquals(checkbox.render(), "Rendering a Windows checkbox");
    }

    @Test
    void macOSFactory_shouldReturnButtonAndCheckboxOfMacOS_whenMacOSIsPassed() {
        GUIFactory macOS = new MacOSFactory();
        Button button = macOS.createButton();
        assertEquals(button.render(), "Rendering a macOS button");
        Checkbox checkbox = macOS.createCheckbox();
        assertEquals(checkbox.render(), "Rendering a macOS checkbox");
    }

}
