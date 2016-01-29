package com.skyeYeh.designPatternExample.structural.classAdapter;

/**
 * Created by Skye on 2016/1/29.
 * 轉接器。
 */
public class Adapter extends Adaptee implements Target {
    /**
     * 請求，將 specificRequest 轉成 request。
     *
     * @return 回傳值
     */
    @Override
    public String request() {
        return specificRequest() + "2";
    }
}
