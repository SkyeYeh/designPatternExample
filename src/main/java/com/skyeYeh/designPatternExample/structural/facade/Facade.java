package com.skyeYeh.designPatternExample.structural.facade;

/**
 * Created by Skye on 2016/1/29.
 * 表象。
 */
public class Facade {
    Foobar1 foobar1;
    Foobar2 foobar2;

    public Facade(Foobar1 foobar1, Foobar2 foobar2) {
        this.foobar1 = foobar1;
        this.foobar2 = foobar2;
    }

    /**
     * 統一而簡化的介面。
     *
     * @return 回傳值
     */
    public String foobar() {
        return foobar1.foobar1() + foobar2.foobar2();
    }
}
