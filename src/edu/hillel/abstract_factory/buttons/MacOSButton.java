package edu.hillel.abstract_factory.buttons;

public class MacOSButton implements IButton {

    @Override
    public void paint() {
        System.out.println(String.format("Component name is %s, family is %s",
                IButton.class.getSimpleName(), MacOSButton.class.getSimpleName()));
    }
}
