package com.sdlhz.soft.abfactory.core;

import com.sdlhz.soft.abfactory.objs.color.Blue;
import com.sdlhz.soft.abfactory.objs.color.Green;
import com.sdlhz.soft.abfactory.objs.color.Red;
import com.sdlhz.soft.abfactory.objs.common.Color;
import com.sdlhz.soft.abfactory.objs.common.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
