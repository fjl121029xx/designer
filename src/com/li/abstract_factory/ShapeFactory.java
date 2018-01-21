package com.li.abstract_factory;

import com.li.factory.Circle;
import com.li.factory.Rectangle;
import com.li.factory.Shape;
import com.li.factory.Square;

public class ShapeFactory extends AbstractFactoy {

    @Override
    Color getColor(String colorType) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {

            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {

            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {

            return new Square();
        }
        return null;
    }
}
