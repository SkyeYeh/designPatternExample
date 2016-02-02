package com.skyeYeh.designPatternExample.structural.iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

/**
 * Created by Skye on 2016/2/2.
 * 反覆器模式，讓我們能夠取得一個聚集內的每一個元素，而不需要此聚集將其實踐方式暴露出來。
 */
public class IteratorImplTest {
    Aggregate aggregate1;
    Aggregate aggregate2;
    Iterator iterator1;
    Iterator iterator2;

    @Before
    public void setUp() throws Exception {
        aggregate1 = new AggregateImpl1();
        aggregate2 = new AggregateImpl2();
        iterator1 = aggregate1.createIterator();
        iterator2 = aggregate2.createIterator();
    }

    @Test
    public void testHasNext() throws Exception {
        Assert.assertEquals(true, iterator1.hasNext());
        Assert.assertEquals(true, iterator2.hasNext());
    }

    @Test
    public void testNext() throws Exception {
        Assert.assertEquals("foobar1", iterator1.next());
        Assert.assertEquals("foobar1", iterator2.next());
    }

    @Test
    public void testRemove() throws Exception {
        iterator1.next();
        iterator1.remove();
        Assert.assertEquals("foobar3", iterator1.next());
        iterator2.next();
        iterator2.remove();
        Assert.assertEquals("foobar2", iterator2.next());
    }
}