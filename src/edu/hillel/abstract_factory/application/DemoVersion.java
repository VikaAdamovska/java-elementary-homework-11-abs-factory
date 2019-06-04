package edu.hillel.abstract_factory.application;

import edu.hillel.abstract_factory.factories.AbstractFactory;
import edu.hillel.abstract_factory.factories.MacOSFactory;
import edu.hillel.abstract_factory.factories.WindowsFactory;

import java.util.Scanner;

public class DemoVersion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AppFactory appFactory = DemoVersion.applicationFactory(scanner);
        appFactory.paint();

    }

    public static AppFactory applicationFactory(Scanner scanner) {
        System.out.println("Please, choose your operating system (mac - MacOS, win - Windows)!");
        String userOperationSystem = scanner.nextLine();
        AbstractFactory abstractFactory;
        AppFactory application;

        switch (userOperationSystem) {
            case "mac":
                System.out.println("I am making new MacOSFactory");
                abstractFactory = new MacOSFactory();
                application = new AppFactory(abstractFactory);
                break;

            case "win":
                System.out.println("I am making new WindowsFactory");
                abstractFactory = new WindowsFactory();
                application = new AppFactory(abstractFactory);
                break;

            default:
                abstractFactory = null;
                application = null;
        }
        return application;
    }
}