package com.skyeYeh.designPatternExample.behavioral.observer2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Skye on 2016/1/24.
 * 主題物件。
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
}
