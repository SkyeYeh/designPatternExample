package com.skyeYeh.designPatternExample.observerJava;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Skye on 2016/1/24.
 */
public class Subject extends Observable {
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        super.deleteObserver(o);
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }
}
