package com.li.abstract_factory;

import com.li.factory.Shape;

public class ColorFactory extends AbstractFactoy {
    @Override
    Color getColor(String colorType) {

        if (colorType == null) {
            return null;
        }
        if (colorType.equalsIgnoreCase("RED")) {

            return new Red();
        } else if (colorType.equalsIgnoreCase("BLUE")) {

            return new Blue();
        } else if (colorType.equalsIgnoreCase("GREEN")) {

            return new Green();
        }
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        return null;
    }
}
