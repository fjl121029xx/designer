package com.li.facade.impl;

import com.li.facade.Shape;

public class Square implements Shape {

    @Override
    public void draw() {

        System.out.println("Square :: draw()");
    }
}
