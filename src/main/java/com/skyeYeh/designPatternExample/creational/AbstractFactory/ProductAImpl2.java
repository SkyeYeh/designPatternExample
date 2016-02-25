package com.skyeyeh.designpatternexample.creational.abstractFactory;

/**
 * Created by Skye on 2016/1/26.
 * 實作產品。
 */
public class ProductAImpl2 implements ProductA {
    /**
     * 產品方法實作。
     *
     * @return 參數1
     */
    @Override
    public String foobarA() {
        return "foobarA2";
    }
}
