package com.sdlhz.soft.abfactory.objs.shape;


import com.sdlhz.soft.abfactory.objs.common.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}