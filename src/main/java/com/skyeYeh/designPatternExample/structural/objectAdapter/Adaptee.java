package com.skyeYeh.designPatternExample.structural.objectAdapter;

/**
 * Created by Skye on 2016/1/29.
 * 被轉接者。
 */
public class Adaptee {
    public String specificRequest() {
        return "foobar";
    }
}