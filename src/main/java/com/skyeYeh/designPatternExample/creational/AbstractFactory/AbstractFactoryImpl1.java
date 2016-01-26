package com.skyeYeh.designPatternExample.creational.abstractFactory;

/**
 * Created by Skye on 2016/1/26.
 * 實作抽象工廠。
 */
public class AbstractFactoryImpl1 implements AbstractFactory {
    /**
     * 建立產品A。
     *
     * @return 產品A
     */
    @Override
    public ProductA CreateProductA() {
        return new ProductAImpl1();
    }

    /**
     * 建立產品B。
     *
     * @return 產品B
     */
    @Override
    public ProductB CreateProductB() {
        return new ProductBImpl1();
    }
}