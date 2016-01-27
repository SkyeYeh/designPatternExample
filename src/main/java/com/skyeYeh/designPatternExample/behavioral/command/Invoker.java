package com.skyeYeh.designPatternExample.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Skye on 2016/1/27.
 * 調用者。
 */
public class Invoker {
    List<Command> commands = new ArrayList<>();

    public void setCommand(Command command) {
        commands.add(command);
    }

    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
