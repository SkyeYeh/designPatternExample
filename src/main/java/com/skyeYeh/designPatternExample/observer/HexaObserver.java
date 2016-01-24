package com.skyeYeh.designPatternExample.observer;

/**
 * Created by Skye on 2016/1/24.
 * 觀察者。
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("HexaObserver: " + Integer.toHexString(subject.getState()));
    }
}
