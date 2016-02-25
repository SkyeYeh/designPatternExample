package com.skyeyeh.designpatternexample.structural.templateMethod;

/**
 * Created by Skye on 2016/2/2.
 * 抽象樣板方法。
 */
public abstract class AbstractClass {
    private String result;

    /**
     * 樣板方法。
     * 為了防止次類別改變樣板方法中的演算法，可以將樣板方法宣告為 final。
     *
     * @return 字串
     */
    final String templateMethod() {
        result = "";
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
