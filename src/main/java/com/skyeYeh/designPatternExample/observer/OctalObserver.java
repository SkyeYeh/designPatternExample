package com.skyeYeh.designPatternExample.observer;

/**
 * Created by Skye on 2016/1/24.
 * 觀察者。
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("OctalObserver: " + Integer.toOctalString(subject.getState()));
    }
}
