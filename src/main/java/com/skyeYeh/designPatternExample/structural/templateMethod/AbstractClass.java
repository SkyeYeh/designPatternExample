package com.skyeYeh.designPatternExample.structural.templateMethod;

/**
 * Created by Skye on 2016/2/2.
 * 抽象樣板方法。
 */
public abstract class AbstractClass {
    /**
     * 樣板方法。
     *
     * @return 字串
     */
    final String templateMethod() {
        String result = "";
        result += primitiveOperation1();
        result += primitiveOperation2();
        return result;
    }

    /**
     * 樣板方法所用到的抽象方法。
     *
     * @return 字串
     */
    abstract String primitiveOperation1();

    /**
     * 樣板方法所用到的抽象方法。
     *
     * @return 字串
     */
    abstract String primitiveOperation2();
}
