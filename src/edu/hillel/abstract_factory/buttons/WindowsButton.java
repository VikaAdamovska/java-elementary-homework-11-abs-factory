package edu.hillel.abstract_factory.buttons;


public class WindowsButton implements IButton {

    @Override
    public void paint() {
        System.out.println(String.format("Component name is %s, family is %s",
                IButton.class.getSimpleName(), WindowsButton.class.getSimpleName()));
    }
}
