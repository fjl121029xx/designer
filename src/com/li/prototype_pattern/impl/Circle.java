package com.li.prototype_pattern.impl;

import com.li.prototype_pattern.ShapeAbstract;

public class Circle extends ShapeAbstract {

    public Circle() {

        type = "Circle";
    }

    @Override
    public void draw() {

        System.out.println(" Incide Cirdle : draw() method. ");
    }
}
