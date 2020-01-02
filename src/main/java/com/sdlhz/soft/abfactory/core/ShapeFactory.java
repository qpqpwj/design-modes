package com.sdlhz.soft.abfactory.core;

import com.sdlhz.soft.abfactory.objs.common.Color;
import com.sdlhz.soft.abfactory.objs.common.Shape;
import com.sdlhz.soft.abfactory.objs.shape.Circle;
import com.sdlhz.soft.abfactory.objs.shape.Rectangle;
import com.sdlhz.soft.abfactory.objs.shape.Square;


public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
