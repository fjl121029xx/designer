package com.li.bridge.impl;

import com.li.bridge.DrawAPI;
import com.li.bridge.Shape;

public class Circle extends Shape {

    private int x, y, radius;


    public Circle(DrawAPI DRAW_API, int x, int y, int radius) {
        super(DRAW_API);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {

        DRAW_API.drawCircle(radius, x, y);
    }
}
