package com.sdlhz.soft.decorator.objs.common;

import com.sdlhz.soft.decorator.objs.Shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratorShape = decoratedShape;
    }

    public void draw(){
        decoratorShape.draw();
    }
}
