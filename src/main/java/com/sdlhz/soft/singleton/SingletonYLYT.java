package com.sdlhz.soft.singleton;

public class SingletonYLYT {
    private static SingletonYLYT instance;
    private SingletonYLYT(){}
    public static synchronized SingletonYLYT getInstance() {
        if (instance == null) {
            instance = new SingletonYLYT();
        }
        return instance;
    }


    public static void main(String[] args) {
        SingletonYLYT  singletonYLYT = new SingletonYLYT();
    }
}
