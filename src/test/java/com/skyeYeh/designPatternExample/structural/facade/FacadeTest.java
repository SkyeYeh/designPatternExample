package com.skyeYeh.designPatternExample.structural.facade;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Skye on 2016/1/29.
 * 表象模式，提供了一個統一的介面，用來存取次系統中的一群介面。表象定義了一個較高層次的介面，讓次系統更容易使用。
 */
public class FacadeTest {
    Foobar1 foobar1;
    Foobar2 foobar2;
    Facade facade;

    @Before
    public void setUp() throws Exception {
        foobar1 = new Foobar1();
        foobar2 = new Foobar2();
        facade = new Facade(foobar1, foobar2);
    }

    @Test
    public void testFoobar() throws Exception {
        Assert.assertEquals("foobar1foobar2", facade.foobar());
    }
}