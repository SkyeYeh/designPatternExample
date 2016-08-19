package com.skyeyeh.designpatternexample.creational.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Skye on 2016/1/27.
 * 獨體模式，確保一個類別只有一個實體，並給它一個存取的全域點。
 */
public class SingletonTest {
    Singleton singleton1;
    Singleton singleton2;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testGetInstance() throws Exception {
        singleton1 = Singleton.getInstance();
        singleton2 = Singleton.getInstance();
        Assert.assertEquals(singleton1, singleton2);
    }
}