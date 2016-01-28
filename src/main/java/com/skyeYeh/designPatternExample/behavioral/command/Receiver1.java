package com.skyeYeh.designPatternExample.behavioral.command;

/**
 * Created by Skye on 2016/1/27.
 * 接收者。
 */
public class Receiver1 {
    /**
     * 執行動作。
     */
    public void action() {
        System.out.println("Action1.");
    }

    /**
     * 取消動作
     */
    public void undoAction() {
        System.out.println("Undo action1.");
    }
}
