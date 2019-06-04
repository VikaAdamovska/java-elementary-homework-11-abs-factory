package edu.hillel.abstract_factory.application;

import edu.hillel.abstract_factory.buttons.IButton;
import edu.hillel.abstract_factory.checkboxes.ICheckbox;
import edu.hillel.abstract_factory.factories.AbstractFactory;

public class AppFactory {

    private IButton button;
    private ICheckbox checkbox;

    public AppFactory(AbstractFactory factory) {
        button = factory.createIButton();
        checkbox = factory.createICheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
