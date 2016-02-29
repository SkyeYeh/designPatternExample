package com.skyeyeh.designpatternexample.creational.factorymethod;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Skye on 2016/1/26.
 * 工廠方法模式，定義了一個建立物件的介面，但由次類別決定要實體化的類別為何者。工廠方法讓類別把實體化的動作，交由次類別進行。
 */
public class CreatorTest {
    Creator creator;

    @Before
    public void setUp() throws Exception {
        creator = new CreatorImpl();
    }

    @Test
    public void testFactoryMethod() throws Exception {
        Product productImpl1 = creator.factoryMethod("productImpl1");
        Assert.assertEquals("foobar1", productImpl1.foobar());
        Product productImpl2 = creator.factoryMethod("productImpl2");
        Assert.assertEquals("foobar2", productImpl2.foobar());
    }
}