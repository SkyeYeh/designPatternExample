package com.skyeyeh.designpatternexample.behavioral.command;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Skye on 2016/1/27.
 * 接收者。
 */
public class Receiver1 {
    private static final Logger LOGGER = Logger.getLogger(Receiver1.class.getName());

    /**
     * 執行動作。
     */
    public void action() {
        LOGGER.log(Level.INFO, "Action1.");
    }

    /**
     * 取消動作
     */
    public void undoAction() {
        LOGGER.log(Level.INFO, "Undo action1.");
    }
}
