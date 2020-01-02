package com.sdlhz.soft.abfactory.objs.shape;


import com.sdlhz.soft.abfactory.objs.common.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}