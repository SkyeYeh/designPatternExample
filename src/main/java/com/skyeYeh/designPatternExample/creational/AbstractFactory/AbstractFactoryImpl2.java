package com.skyeYeh.designPatternExample.creational.abstractFactory;

/**
 * Created by Skye on 2016/1/26.
 * 實作抽象工廠。
 */
public class AbstractFactoryImpl2 implements AbstractFactory {
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
