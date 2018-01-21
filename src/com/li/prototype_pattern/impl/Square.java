package com.li.prototype_pattern.impl;

import com.li.prototype_pattern.ShapeAbstract;

public class Square extends ShapeAbstract {

    public Square() {

        type = "Square";
    }

    @Override
    public void draw() {

        System.out.println(" Incide Square : draw() method. ");
    }
}
