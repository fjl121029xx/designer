package com.li.abstract_factory;

public class FactoryProducer {

    public static AbstractFactoy getFactory(String choice) {

        if (choice.equalsIgnoreCase("SHAPE")) {

            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {

            return new ColorFactory();
        }

        return null;
    }
}
