package com.skyeYeh.designPatternExample.structural.templateMethod;

/**
 * Created by Skye on 2016/2/2.
 * 樣板方法實作。
 */
public class AbstractClassImpl2 extends AbstractClass {
    /**
     * 實作樣板方法所用到的抽象方法。
     *
     * @return 字串
     */
    @Override
    String primitiveOperation1() {
        return "foobar21";
    }

    /**
     * 實作樣板方法所用到的抽象方法。
     *
     * @return 字串
     */
    @Override
    String primitiveOperation2() {
        return "foobar22";
    }
}
