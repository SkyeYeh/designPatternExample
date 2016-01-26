package com.skyeYeh.designPatternExample.creational.abstractFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Skye on 2016/1/26.
 * 抽象工廠模式，提供了一個介面，建立相關或相依物件之家族，而不需要明確指定具象類別。
 */
public class AbstractFactoryTest {
    AbstractFactory abstractFactoryImpl1;
    AbstractFactory abstractFactoryImpl2;

    @Before
    public void setUp() throws Exception {
        abstractFactoryImpl1 = new AbstractFactoryImpl1();
        abstractFactoryImpl2 = new AbstractFactoryImpl2();
    }

    @Test
    public void testCreateProductA() throws Exception {
        ProductA product1A = abstractFactoryImpl1.CreateProductA();
        ProductA product2A = abstractFactoryImpl2.CreateProductA();

        Assert.assertEquals("foobarA1", product1A.foobarA());
        Assert.assertEquals("foobarA2", product2A.foobarA());
    }

    @Test
    public void testCreateProductB() throws Exception {
        ProductB product1B = abstractFactoryImpl1.CreateProductB();
        ProductB product2B = abstractFactoryImpl2.CreateProductB();

        Assert.assertEquals("foobarB1", product1B.foobarB());
        Assert.assertEquals("foobarB2", product2B.foobarB());
    }
}