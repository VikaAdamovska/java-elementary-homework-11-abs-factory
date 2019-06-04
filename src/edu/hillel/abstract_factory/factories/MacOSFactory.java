package edu.hillel.abstract_factory.factories;

import edu.hillel.abstract_factory.buttons.IButton;
import edu.hillel.abstract_factory.buttons.MacOSButton;
import edu.hillel.abstract_factory.checkboxes.ICheckbox;
import edu.hillel.abstract_factory.checkboxes.MacOSCheckbox;

public class MacOSFactory extends AbstractFactory {

    @Override
    public IButton createIButton() {
        return new MacOSButton();
    }

    @Override
    public ICheckbox createICheckbox() {
        return new MacOSCheckbox();
    }

}
