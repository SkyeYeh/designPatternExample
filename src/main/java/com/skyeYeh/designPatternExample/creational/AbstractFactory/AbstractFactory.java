package com.skyeYeh.designPatternExample.creational.abstractFactory;

/**
 * Created by Skye on 2016/1/26.
 * 抽象工廠介面。
 */
public interface AbstractFactory {
    /**
     * 抽象工廠建立產品A。
     *
     * @param type 產品種類
     * @return 產品A
     */
    public ProductA CreateProductA(String type);

    /**
     * 抽象工廠建立產品B。
     *
     * @return 產品B
     */
    public ProductB CreateProductB();
}
