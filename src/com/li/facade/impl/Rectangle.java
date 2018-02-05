package com.li.facade.impl;

import com.li.facade.Shape;

public class Rectangle implements Shape{


    @Override
    public void draw() {

        System.out.println("Rectangle :: draw()");
    }
}
