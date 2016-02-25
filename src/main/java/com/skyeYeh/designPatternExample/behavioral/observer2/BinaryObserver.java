package com.skyeyeh.designpatternexample.behavioral.observer2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Skye on 2016/1/24.
 * 觀察者。
 */
public class BinaryObserver extends Observer {
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        logger.log(Level.INFO, "BinaryObserver: " + Integer.toBinaryString(subject.getState()));
    }
}
