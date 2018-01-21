package com.li.prototype.impl;

import com.li.prototype.ShapeAbstract;

public class Circle extends ShapeAbstract {

    public Circle() {

        type = "Circle";
    }

    @Override
    public void draw() {

        System.out.println(" Incide Cirdle : draw() method. ");
    }
}
