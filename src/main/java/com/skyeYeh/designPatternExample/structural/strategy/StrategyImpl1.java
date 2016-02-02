package com.skyeYeh.designPatternExample.structural.strategy;

/**
 * Created by Skye on 2016/2/2.
 * 實作策略。
 */
public class StrategyImpl1 implements Strategy {
    /**
     * 實作演算法。
     *
     * @return 字串
     */
    @Override
    public String doTask() {
        return "foobar1";
    }
}
