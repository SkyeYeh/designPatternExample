package com.skyeYeh.designPatternExample.creational.singleton;

/**
 * Created by Skye on 2016/1/27.
 * 獨體。
 */
public class Singleton {
    private static Singleton ourInstance = new Singleton();

    /**
     * 存取的全域點，實體化物件並回傳。
     *
     * @return 類別實體
     */
    public static Singleton getInstance() {
        return ourInstance;
    }

    /**
     * 私有的建構子。
     */
    private Singleton() {
    }
}
