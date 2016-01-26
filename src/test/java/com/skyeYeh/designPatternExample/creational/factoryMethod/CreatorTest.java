package com.skyeYeh.designPatternExample.creational.factoryMethod;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Skye on 2016/1/26.
 * 工廠方法模式單元測試。
 */
public class CreatorTest {
    Creator creator;

    @Before
    public void setUp() throws Exception {
        creator = new CreatorImpl();
    }

    @Test
    public void testFactoryMethod() throws Exception {
        Product productImpl1 = creator.orderProduct("productImpl1");
        Assert.assertEquals("foobar1", productImpl1.foobar());
        Product productImpl2 = creator.orderProduct("productImpl2");
        Assert.assertEquals("foobar2", productImpl2.foobar());
    }
}