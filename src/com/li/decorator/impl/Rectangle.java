package com.li.decorator.impl;

import com.li.decorator.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {

        System.out.println("Shape : Rectangle");
    }
}
