package com.skyeYeh.designPatternExample.creational.abstractFactory;

/**
 * Created by Skye on 2016/1/26.
 * 實作抽象工廠。
 */
public class AbstractFactoryImpl2 implements AbstractFactory {
    /**
     * 實作抽象工廠建立產品A。
     *
     * @param type 產品種類
     * @return 產品A
     */
    @Override
    public ProductA CreateProductA(String type) {
        ProductA product = null;
        if ("productAImpl1".equals(type)) {
            product = new ProductAImpl1();
        } else if ("productAImpl2".equals(type)) {
            product = new ProductAImpl2();
        }
        return product;
    }

    /**
     * 實作抽象工廠建立產品B。
     *
     * @return 產品B
     */
    @Override
    public ProductB CreateProductB() {
        return new ProductBImpl2();
    }
}
