package com.li.prototype.impl;

import com.li.prototype.ShapeAbstract;

public class Square extends ShapeAbstract {

    public Square() {

        type = "Square";
    }

    @Override
    public void draw() {

        System.out.println(" Incide Square : draw() method. ");
    }
}
