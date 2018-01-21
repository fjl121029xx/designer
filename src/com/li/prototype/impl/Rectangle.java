package com.li.prototype.impl;

import com.li.prototype.ShapeAbstract;

public class Rectangle extends ShapeAbstract {

    public Rectangle() {

        type = "Rectangle";
    }

    @Override
    public void draw() {

        System.out.println(" Incide Rectangle : draw() method. ");
    }
}
