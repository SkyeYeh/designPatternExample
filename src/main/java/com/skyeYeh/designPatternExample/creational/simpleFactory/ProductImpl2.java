package com.skyeYeh.designPatternExample.creational.simpleFactory;

/**
 * Created by Skye on 2016/1/26.
 * 產品實作。
 */
public class ProductImpl2 extends Product {
    /**
     * 產品方法實作。
     *
     * @return 參數1
     */
    @Override
    public String foobar() {
        return "foobar2";
    }
}