package com.skyeYeh.designPatternExample.structural.objectAdapter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Skye on 2016/1/29.
 * 轉接器模式，將一個類別的介面，轉換成另一個介面以供客戶使用。轉換器讓原本介面不相容的類別可以合作無間。
 */
public class TargetTest {
    private Adaptee adaptee;
    private Target target;


    @Before
    public void setUp() throws Exception {
        adaptee = new Adaptee();
        target = new TargetImpl(adaptee);
    }

    @Test
    public void testRequest() throws Exception {
        Assert.assertEquals("foobar", target.request());
    }
}