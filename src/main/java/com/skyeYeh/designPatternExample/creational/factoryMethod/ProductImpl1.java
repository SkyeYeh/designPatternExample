package com.skyeyeh.designpatternexample.creational.factoryMethod;

/**
 * Created by Skye on 2016/1/26.
 * 產品實作。
 */
public class ProductImpl1 implements Product {
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
