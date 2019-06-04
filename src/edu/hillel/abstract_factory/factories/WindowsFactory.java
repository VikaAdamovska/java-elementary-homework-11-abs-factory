package edu.hillel.abstract_factory.factories;

import edu.hillel.abstract_factory.buttons.IButton;
import edu.hillel.abstract_factory.buttons.WindowsButton;
import edu.hillel.abstract_factory.checkboxes.ICheckbox;
import edu.hillel.abstract_factory.checkboxes.WindowsCheckbox;

public class WindowsFactory extends AbstractFactory {

    @Override
    public IButton createIButton() {
        return new WindowsButton();
    }

    @Override
    public ICheckbox createICheckbox() {
        return new WindowsCheckbox();
    }
}
