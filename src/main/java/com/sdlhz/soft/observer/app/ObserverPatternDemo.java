package com.sdlhz.soft.observer.app;

import com.sdlhz.soft.observer.objs.BinaryObserver;
import com.sdlhz.soft.observer.objs.HexaObserver;
import com.sdlhz.soft.observer.objs.OctalObserver;
import com.sdlhz.soft.observer.objs.Subject;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("Start is change to 15");
        subject.setState(15);
        System.out.println();
        System.out.println("Start is change to 10");
        subject.setState(10);
    }
}
