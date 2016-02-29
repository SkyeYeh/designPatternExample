package com.skyeyeh.designpatternexample.structural.templatemethod;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Skye on 2016/2/2.
 * 樣板方法模式，將一個演算法的骨架定義在一個方法中，而演算法本身會用到的一些方法，則是定義再次類別中。樣板方法讓次類別在不改變演算法架構的情況下，重新定義演算法中的某些步驟。
 */
public class AbstractClassTest {
    AbstractClass abstractClass1;
    AbstractClass abstractClass2;

    @Before
    public void setUp() throws Exception {
        abstractClass1 = new AbstractClassImpl1();
        abstractClass2 = new AbstractClassImpl2();
    }

    @Test
    public void testTemplateMethod() throws Exception {
        Assert.assertEquals("foobar11foobar12", abstractClass1.templateMethod());
        Assert.assertEquals("foobar21foobar22", abstractClass2.templateMethod());
    }
}