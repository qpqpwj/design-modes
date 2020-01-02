package com.sdlhz.soft.factory.core;

import com.sdlhz.soft.factory.objs.Circle;
import com.sdlhz.soft.factory.objs.Rectangle;
import com.sdlhz.soft.factory.objs.common.Shape;
import com.sdlhz.soft.factory.objs.Square;

public class ShapeFactory {

    public Shape getShape(String shapeType){
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
