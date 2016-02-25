package com.skyeyeh.designpatternexample.behavioral.observer2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Skye on 2016/1/24.
 * 觀察者。
 */
public class HexaObserver extends Observer {
    private static final Logger LOGGER = Logger.getLogger(HexaObserver.class.getName());

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        LOGGER.log(Level.INFO, "HexaObserver: " + Integer.toHexString(subject.getState()));
    }
}
