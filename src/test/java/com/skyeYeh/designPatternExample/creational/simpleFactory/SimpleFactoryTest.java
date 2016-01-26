package com.skyeYeh.designPatternExample.creational.simpleFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Skye on 2016/1/26.
 * 簡單工廠模式單元測試。
 */
public class SimpleFactoryTest {
    SimpleFactory simpleFactory;
    ProductStore productStore;

    @Before
    public void setUp() throws Exception {
        simpleFactory = new SimpleFactory();
        productStore = new ProductStore(simpleFactory);
    }

    @Test
    public void testCreateProduct() throws Exception {
        Product productImpl1 = productStore.orderProduct("productImpl1");
        Assert.assertEquals("foobar1", productImpl1.foobar());
        Product productImpl2 = productStore.orderProduct("productImpl2");
        Assert.assertEquals("foobar2", productImpl2.foobar());
    }
}