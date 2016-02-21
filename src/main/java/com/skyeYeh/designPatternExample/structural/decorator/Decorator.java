package com.skyeYeh.designPatternExample.structural.decorator;

/**
 * Created by Skye on 2016/1/25.
 * 抽象裝飾者。
 */
public abstract class Decorator implements Component {
    /**
     * 強制實作裝飾者擴充。
     *
     * @return 參數2
     */
    @Override
    public abstract int methodB();
}
