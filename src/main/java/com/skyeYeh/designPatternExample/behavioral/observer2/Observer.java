package com.skyeYeh.designPatternExample.behavioral.observer2;

/**
 * Created by Skye on 2016/1/24.
 * 觀察者介面。
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
