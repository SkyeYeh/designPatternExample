package com.skyeyeh.designpatternexample.behavioral.command;

/**
 * Created by Skye on 2016/1/27.
 * 命令。
 */
public class CommandImpl1 implements Command {
    Receiver1 receiver = new Receiver1();

    public CommandImpl1(Receiver1 receiver) {
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
