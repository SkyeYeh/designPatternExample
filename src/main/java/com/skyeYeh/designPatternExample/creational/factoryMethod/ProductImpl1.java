package com.skyeYeh.designPatternExample.creational.factoryMethod;

/**
 * Created by Skye on 2016/1/26.
 * 產品實作。
 */
public class ProductImpl1 extends Product {
    /**
     * 產品方法實作。
     *
     * @return 參數1
     */
    @Override
    public String foobar() {
        return "foobar1";
    }
}
