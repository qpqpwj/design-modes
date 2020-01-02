package com.sdlhz.soft.abfactory.core;

import com.sdlhz.soft.abfactory.objs.common.Color;
import com.sdlhz.soft.abfactory.objs.common.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
