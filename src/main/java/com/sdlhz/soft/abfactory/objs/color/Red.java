package com.sdlhz.soft.abfactory.objs.color;

import com.sdlhz.soft.abfactory.objs.common.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
