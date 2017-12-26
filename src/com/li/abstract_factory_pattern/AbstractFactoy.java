package com.li.abstract_factory_pattern;

import com.li.factory_partten.Shape;

public abstract class AbstractFactoy {

    abstract Color getColor(String colorType);
    abstract Shape getShape(String shapeType);
}
