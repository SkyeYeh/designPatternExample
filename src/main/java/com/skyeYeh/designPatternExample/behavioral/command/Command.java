package com.skyeyeh.designpatternexample.behavioral.command;

/**
 * Created by Skye on 2016/1/27.
 * 命令介面。
 */
public interface Command {
    /**
     * 執行動作。
     */
    public void execute();

    /**
     * 取消動作。
     */
    public void undo();
}
