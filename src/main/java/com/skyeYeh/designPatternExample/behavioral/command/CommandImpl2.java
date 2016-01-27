package com.skyeYeh.designPatternExample.behavioral.command;

/**
 * Created by Skye on 2016/1/27.
 * 命令。
 */
public class CommandImpl2 implements Command {
    Receiver2 receiver = new Receiver2();

    public CommandImpl2(Receiver2 receiver) {
        this.receiver = receiver;
    }

    /**
     * 執行。
     */
    @Override
    public void execute() {
        receiver.action();
    }

    /**
     * 復原。
     */
    @Override
    public void undo() {
        receiver.undoAction();
    }
}
