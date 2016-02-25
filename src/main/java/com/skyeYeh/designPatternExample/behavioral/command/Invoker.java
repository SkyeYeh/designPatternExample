package com.skyeyeh.designpatternexample.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Skye on 2016/1/27.
 * 調用者。
 */
public class Invoker {
    List<Command> commands = new ArrayList<>();

    /**
     * 設定命令。
     *
     * @param command 命令
     */
    public void setCommand(Command command) {
        commands.add(command);
    }

    /**
     * 依序執行動作。
     */
    public void execute() {
        commands.forEach(Command::execute);
    }

    /**
     * 依序取消動作。
     */
    public void undo() {
        commands.forEach(Command::undo);
    }
}
