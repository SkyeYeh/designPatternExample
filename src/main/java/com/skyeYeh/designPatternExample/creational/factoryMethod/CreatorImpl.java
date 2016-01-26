package com.skyeYeh.designPatternExample.creational.factoryMethod;

/**
 * Created by Skye on 2016/1/26.
 * 建立者。
 */
public class CreatorImpl extends Creator {
    /**
     * 實作工廠方法建立產品。
     *
     * @param type 產品種類
     * @return 產品
     */
    @Override
    protected Product factoryMethod(String type) {
        Product product = null;
        if ("productImpl1".equals(type)) {
            product = new ProductImpl1();
        } else if ("productImpl2".equals(type)) {
            product = new ProductImpl2();
        }
        return product;
    }
}
