package com.skyeyeh.designpatternexample.behavioral.observer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Skye on 2016/1/25.
 * 觀察者模式，定義了物件之間的一對多關係，如此一來，當一個物件改變狀態，其他相依者都會收到通知並自動被更新。
 */
public class ObserverTest {
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
    public void testUpdate() throws Exception {
        subject.setStatus("Hello", "Observer Pattern");
        Assert.assertEquals(2, subject.countObservers());
    }
}