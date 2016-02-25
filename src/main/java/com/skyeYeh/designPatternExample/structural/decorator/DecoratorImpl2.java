package com.skyeyeh.designpatternexample.structural.decorator;

/**
 * Created by Skye on 2016/1/26.
 * 裝飾者實作。
 */
public class DecoratorImpl2 extends Decorator {
    Component component;

    public DecoratorImpl2(Component component) {
        this.component = component;
    }

    /**
     * 裝飾子類別實作。
     *
     * @return 參數1
     */
    @Override
    public String methodA() {
        return component.methodA() + ", DecoratorImpl2";
    }

    /**
     * 裝飾父類別。
     *
     * @return 參數2
     */
    @Override
    public int methodB() {
        return component.methodB() + 20;
    }
}
