package com.li.prototype_pattern.impl;

import com.li.prototype_pattern.ShapeAbstract;

public class Rectangle extends ShapeAbstract {

    public Rectangle() {

        type = "Rectangle";
    }

    @Override
    public void draw() {

        System.out.println(" Incide Rectangle : draw() method. ");
    }
}
