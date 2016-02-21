package com.skyeYeh.designPatternExample.structural.decorator;

/**
 * Created by Skye on 2016/1/25.
 * 抽象父類別。
 */
public interface Component {
    /**
     * 子類別實作。
     *
     * @return 參數1
     */
    String methodA();

    /**
     * 裝飾者擴充。
     *
     * @return 參數2
     */
    default int methodB() {
        return 100;
    }
}
