package com.li.facade.impl;

import com.li.facade.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {

        System.out.println("Circle :: draw()");
    }
}
