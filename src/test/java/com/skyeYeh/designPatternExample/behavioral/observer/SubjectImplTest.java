package com.skyeYeh.designPatternExample.behavioral.observer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Skye on 2016/1/25.
 * 觀察者模式單元測試。
 */
public class SubjectImplTest {
    SubjectImpl subject;
    Observer observer1;
    Observer observer2;

    @Before
    public void setUp() throws Exception {
        subject = new SubjectImpl();
        observer1 = new ObserverImpl1(subject);
        observer2 = new ObserverImpl2(subject);
    }

    @Test
    public void testSetStatus() throws Exception {
        subject.setStatus("Hello", "Observer Pattern");
        Assert.assertEquals(2, subject.countObservers());
    }
}