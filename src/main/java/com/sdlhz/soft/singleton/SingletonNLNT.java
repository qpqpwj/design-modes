package com.sdlhz.soft.singleton;

public class SingletonNLNT {
    private static SingletonNLNT instance;
    private SingletonNLNT(){}

    public static SingletonNLNT getInstance() {
        if (instance == null) {
            instance = new SingletonNLNT();
        }
        return instance;
    }
}