package com.sdlhz.soft.builder.obj;

public abstract class Burger implements Item {
    public Packing packing(){
        return new Wrapper();
    }
    public abstract float price();

}
