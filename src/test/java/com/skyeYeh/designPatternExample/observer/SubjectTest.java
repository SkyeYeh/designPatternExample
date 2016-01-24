package com.skyeYeh.designPatternExample.observer;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Skye on 2016/1/24.
 */
public class SubjectTest {
    Subject subject;

    @Before
    public void setUp() throws Exception {
        subject = new Subject();
    }

    @After
    public void tearDown() throws Exception {
        subject = null;
    }

    @Test
    public void testNotifyAllObservers() throws Exception {
        new BinaryObserver(subject);
        new HexaObserver(subject);
        new OctalObserver(subject);
        System.out.println("15: ");
        subject.setState(15);
        Assert.assertEquals(15, subject.getState());
    }
}