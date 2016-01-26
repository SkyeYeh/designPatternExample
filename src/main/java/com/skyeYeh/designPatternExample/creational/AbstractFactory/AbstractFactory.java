package com.skyeYeh.designPatternExample.creational.abstractFactory;

/**
 * Created by Skye on 2016/1/26.
 * 抽象工廠介面。
 */
public interface AbstractFactory {
    /**
     * 建立產品A。
     *
     * @return 產品A
     */
    public ProductA CreateProductA();

    /**
     * 建立產品B。
     *
     * @return 產品B
     */
    public ProductB CreateProductB();
}
