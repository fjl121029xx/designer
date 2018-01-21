package com.li.bridge;

public abstract class Shape {

    protected DrawAPI DRAW_API;

    protected Shape(DrawAPI DRAW_API) {

        this.DRAW_API = DRAW_API;
    }

    public abstract void draw();
}
