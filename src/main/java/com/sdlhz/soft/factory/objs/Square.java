package com.sdlhz.soft.factory.objs;

import com.sdlhz.soft.factory.objs.common.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}