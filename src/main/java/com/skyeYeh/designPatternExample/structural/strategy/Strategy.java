package com.skyeyeh.designpatternexample.structural.strategy;

/**
 * Created by Skye on 2016/2/2.
 * 策略介面。
 */
@FunctionalInterface
public interface Strategy {
    /**
     * 封裝演算法。
     *
     * @return 字串
     */
    String doTask();
}
