package edu.hillel.abstract_factory.checkboxes;

public class MacOSCheckbox implements ICheckbox {

    @Override
    public void paint() {
        System.out.println(String.format("Component name is %s, family is %s",
                ICheckbox.class.getSimpleName(), MacOSCheckbox.class.getSimpleName()));
    }
}
