package com.skyeYeh.designPatternExample.creational.factoryMethod;

/**
 * Created by Skye on 2016/1/26.
 * 抽象建立者
 */
public abstract class Creator {
    /**
     * 抽象工廠方法。
     *
     * @param type 產品種類
     * @return 產品
     */
    protected abstract Product factoryMethod(String type);

    /**
     * 取得產品。
     *
     * @param type 產品種類
     * @return 產品
     */
    public Product orderProduct(String type) {
        Product product;
        product = factoryMethod(type);
        return product;
    }
}
