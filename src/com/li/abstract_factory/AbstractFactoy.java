package com.li.abstract_factory;

import com.li.factory.Shape;

public abstract class AbstractFactoy {

    abstract Color getColor(String colorType);
    abstract Shape getShape(String shapeType);
}
