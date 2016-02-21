package com.skyeYeh.designPatternExample.behavioral.observer2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Skye on 2016/1/24.
 * 觀察者。
 */
public class HexaObserver extends Observer {
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        logger.log(Level.INFO, "HexaObserver: " + Integer.toHexString(subject.getState()));
    }
}
