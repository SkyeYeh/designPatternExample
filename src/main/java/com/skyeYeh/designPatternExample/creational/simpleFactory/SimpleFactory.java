package com.skyeyeh.designpatternexample.creational.simpleFactory;

/**
 * Created by Skye on 2016/1/26.
 * 簡單工廠。
 */
public class SimpleFactory {
    /**
     * 建立產品。
     *
     * @param type 產品種類
     * @return 產品
     */
    public Product createProduct(String type) {
        Product product = null;
        if ("productImpl1".equals(type)) {
            product = new ProductImpl1();
        } else if ("productImpl2".equals(type)) {
            product = new ProductImpl2();
        }
        return product;
    }
}
