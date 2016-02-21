package com.skyeYeh.designPatternExample.behavioral.command;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Skye on 2016/1/27.
 * 接收者。
 */
public class Receiver1 {
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    /**
     * 執行動作。
     */
    public void action() {
        logger.log(Level.INFO, "Action1.");
    }

    /**
     * 取消動作
     */
    public void undoAction() {
        logger.log(Level.INFO, "Undo action1.");
    }
}
