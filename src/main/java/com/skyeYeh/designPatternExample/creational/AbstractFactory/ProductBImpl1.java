package com.skyeYeh.designPatternExample.creational.abstractFactory;

/**
 * Created by Skye on 2016/1/26.
 * 實作產品。
 */
public class ProductBImpl1 implements ProductB {
    /**
     * 產品方法實作。
     *
     * @return 參數1
     */
    @Override
    public String foobarB() {
        return "foobarB1";
    }
}
