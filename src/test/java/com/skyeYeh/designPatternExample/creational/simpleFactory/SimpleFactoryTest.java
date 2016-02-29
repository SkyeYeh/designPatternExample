package com.skyeyeh.designpatternexample.creational.simplefactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Skye on 2016/1/26.
 * 簡單工廠。
 */
public class SimpleFactoryTest {
    SimpleFactory simpleFactory;

    @Before
    public void setUp() throws Exception {
        simpleFactory = new SimpleFactory();
    }

    @Test
    public void testCreateProduct() throws Exception {
        Product productImpl1 = simpleFactory.createProduct("productImpl1");
        Assert.assertEquals("foobar1", productImpl1.foobar());
        Product productImpl2 = simpleFactory.createProduct("productImpl2");
        Assert.assertEquals("foobar2", productImpl2.foobar());
    }
}