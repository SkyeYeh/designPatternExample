package com.skyeYeh.designPatternExample.creational.simpleFactory;

/**
 * Created by Skye on 2016/1/26.
 * 客戶。
 */
public class ProductStore {
    SimpleFactory simpleFactory;

    public ProductStore(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    /**
     * 取得產品。
     *
     * @param type 產品種類
     * @return 產品
     */
    public Product orderProduct(String type) {
        Product product;
        product = simpleFactory.createProduct(type);
        return product;
    }
}
