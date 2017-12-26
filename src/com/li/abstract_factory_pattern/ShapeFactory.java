package com.li.abstract_factory_pattern;

import com.li.factory_partten.Circle;
import com.li.factory_partten.Rectangle;
import com.li.factory_partten.Shape;
import com.li.factory_partten.Square;

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
