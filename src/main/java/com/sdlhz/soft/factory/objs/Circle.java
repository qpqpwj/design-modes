package com.sdlhz.soft.factory.objs;

import com.sdlhz.soft.factory.objs.common.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}