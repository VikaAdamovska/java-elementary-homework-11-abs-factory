package edu.hillel.abstract_factory.checkboxes;

public class WindowsCheckbox implements ICheckbox {

    @Override
    public void paint() {
        System.out.println(String.format("Component name is %s, family is %s",
                ICheckbox.class.getSimpleName(), WindowsCheckbox.class.getSimpleName()));
    }
}
