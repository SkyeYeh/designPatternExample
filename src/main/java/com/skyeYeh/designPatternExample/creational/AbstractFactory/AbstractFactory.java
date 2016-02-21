package com.skyeYeh.designPatternExample.creational.abstractFactory;

/**
 * Created by Skye on 2016/1/26.
 * 抽象工廠介面。
 */
@FunctionalInterface
public interface AbstractFactory {
    /**
     * 抽象工廠建立產品A。
     *
     * @param type 產品種類
     * @return 產品A
     */
    default ProductA CreateProductA(String type) {
        ProductA product = null;
        if ("productAImpl1".equals(type)) {
            product = new ProductAImpl1();
        } else if ("productAImpl2".equals(type)) {
            product = new ProductAImpl2();
        }
        return product;
    }

    /**
     * 抽象工廠建立產品B。
     *
     * @return 產品B
     */
    ProductB CreateProductB();
}
