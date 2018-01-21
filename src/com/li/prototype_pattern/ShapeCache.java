package com.li.prototype_pattern;

import com.li.factory_partten.Shape;
import com.li.prototype_pattern.impl.Circle;
import com.li.prototype_pattern.impl.Rectangle;
import com.li.prototype_pattern.impl.Square;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<Integer, ShapeAbstract> shapMap = new Hashtable<>();

    public static ShapeAbstract getShape(int shapeId) {

        ShapeAbstract cachedShape = shapMap.get(shapeId);

        try {

            return (ShapeAbstract) cachedShape.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;

    }

    public static void loadCache() {

        Circle circle = new Circle();
        circle.setId(1);

        shapMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId(2);

        shapMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId(3);

        shapMap.put(rectangle.getId(), rectangle);
    }
}
