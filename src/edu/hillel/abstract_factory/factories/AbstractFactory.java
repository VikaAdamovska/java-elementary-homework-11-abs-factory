package edu.hillel.abstract_factory.factories;

import edu.hillel.abstract_factory.buttons.IButton;
import edu.hillel.abstract_factory.checkboxes.ICheckbox;

public abstract class AbstractFactory {

    public abstract IButton createIButton();

    public abstract ICheckbox createICheckbox();

}
