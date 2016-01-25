package com.skyeYeh.designPatternExample.structural.decorator;

/**
 * Created by Skye on 2016/1/25.
 * 裝飾者。
 */
public abstract class Decorator extends Component {
    /**
     * 強制實作裝飾者擴充。
     *
     * @return 參數2
     */
    public abstract int methodB();
}
