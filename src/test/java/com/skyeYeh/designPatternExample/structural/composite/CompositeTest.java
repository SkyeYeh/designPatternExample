package com.skyeYeh.designPatternExample.structural.composite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Skye on 2016/2/18.
 * 合成模式，允許你將物件合成樹狀結構，呈現「部分/整體」的階層關係。合成能讓客戶程式碼以一致的方式處理個別物件，以及合成的物件。
 */
public class CompositeTest {
    Component composite1;
    Component composite2;
    Component leaf1;
    Component leaf2;

    @Before
    public void setUp() throws Exception {
        composite1 = new Composite("foobar1");
        composite2 = new Composite("foobar2");
        leaf1 = new Leaf("foobar11");
        leaf2 = new Leaf("foobar21");
    }

    @Test
    public void testOperation() throws Exception {
        composite1.add(composite2);
        composite1.add(leaf1);
        composite2.add(leaf2);

        composite1.operation();
        composite2.operation();
        Assert.assertEquals(composite2, composite1.getChild(0));
    }
}