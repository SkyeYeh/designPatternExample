package com.skyeYeh.designPatternExample.structural.strategy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Skye on 2016/2/2.
 * 策略模式，定義了演算法家族，各別封裝起來，讓它們之間可以互相 替換，此模式讓演算法的變動，不會影響到使用演算法的程式。
 */
public class StrategyTest {
    Strategy strategy1;
    Strategy strategy2;

    @Before
    public void setUp() throws Exception {
        strategy1 = new StrategyImpl1();
        strategy2 = new StrategyImpl2();
    }

    @Test
    public void testDoTask() throws Exception {
        Assert.assertEquals("foobar1", strategy1.doTask());
        Assert.assertEquals("foobar2", strategy2.doTask());
    }
}