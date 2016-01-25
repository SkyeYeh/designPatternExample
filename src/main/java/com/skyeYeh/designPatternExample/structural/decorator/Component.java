package com.skyeYeh.designPatternExample.structural.decorator;

/**
 * Created by Skye on 2016/1/25.
 * 父類別。
 */
public abstract class Component {
    /**
     * 子類別實作。
     *
     * @return 參數1
     */
    public abstract String methodA();

    /**
     * 裝飾者擴充。
     *
     * @return 參數2
     */
    public int methodB() {
        return 100;
    }
}
