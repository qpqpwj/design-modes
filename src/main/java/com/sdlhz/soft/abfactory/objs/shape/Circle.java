package com.sdlhz.soft.abfactory.objs.shape;


import com.sdlhz.soft.abfactory.objs.common.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}