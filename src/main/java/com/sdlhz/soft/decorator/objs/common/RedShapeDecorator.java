package com.sdlhz.soft.decorator.objs.common;

import com.sdlhz.soft.decorator.objs.Shape;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void draw(){
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    public void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color : Red");
    }
}
