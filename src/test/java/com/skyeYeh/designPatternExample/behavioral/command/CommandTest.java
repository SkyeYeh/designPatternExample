package com.skyeYeh.designPatternExample.behavioral.command;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Skye on 2016/1/27.
 * 命令模式，將「請求」封裝成物件，以便使用不同的請求、佇列、或者日誌，參數畫其他物件。命令模式也支援可復原的作業。
 */
public class CommandTest {
    Invoker invoker;
    Command command1;
    Command command2;
    Receiver1 receiver1;
    Receiver2 receiver2;

    @Before
    public void setUp() throws Exception {
        invoker = new Invoker();
        receiver1 = new Receiver1();
        receiver2 = new Receiver2();
    }

    @Test
    public void testExecute() throws Exception {
        command1 = new CommandImpl1(receiver1);
        command2 = new CommandImpl2(receiver2);
        invoker.setCommand(command1);
        invoker.setCommand(command2);
        invoker.execute();
    }

    @Test
    public void testUndo() throws Exception {
        command1 = new CommandImpl1(receiver1);
        command2 = new CommandImpl2(receiver2);
        invoker.setCommand(command1);
        invoker.setCommand(command2);
        invoker.undo();
    }
}