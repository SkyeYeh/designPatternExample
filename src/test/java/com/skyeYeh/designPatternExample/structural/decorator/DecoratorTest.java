package com.skyeyeh.designpatternexample.structural.decorator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Skye on 2016/1/26.
 * 裝飾者模式，動態地將責任加諸於物件上。若要擴充功能，裝飾者提供了比繼承更有彈性的選擇。
 */
public class DecoratorTest {
    Component component1;
    Component component2;

    @Before
    public void setUp() throws Exception {
        component1 = new ComponentImpl1();
        component2 = new ComponentImpl2();
    }

    @Test
    public void testMethodB() throws Exception {
        component1 = new DecoratorImpl1(component1);
        Assert.assertEquals("ComponentImpl1, DecoratorImpl1", component1.methodA());
        Assert.assertEquals(110, component1.methodB());
        component2 = new DecoratorImpl1(component2);
        component2 = new DecoratorImpl2(component2);
        Assert.assertEquals("ComponentImpl2, DecoratorImpl1, DecoratorImpl2", component2.methodA());
        Assert.assertEquals(130, component2.methodB());
    }
}