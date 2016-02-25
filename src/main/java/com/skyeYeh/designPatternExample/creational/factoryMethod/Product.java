package com.skyeyeh.designpatternexample.creational.factoryMethod;

/**
 * Created by Skye on 2016/1/26.
 * 抽象產品。
 */
@FunctionalInterface
public interface Product {
    /**
     * 產品方法。
     *
     * @return 參數1
     */
    String foobar();
}
