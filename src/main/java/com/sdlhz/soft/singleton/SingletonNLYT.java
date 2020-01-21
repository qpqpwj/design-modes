package com.sdlhz.soft.singleton;

public class SingletonNLYT {
    private static SingletonNLYT instance = new SingletonNLYT();
    private SingletonNLYT (){}
    public static SingletonNLYT getInstance() {
        return instance;
    }
}