package com.skyeyeh.designpatternexample.structural.classadapter;

/**
 * Created by Skye on 2016/1/29.
 * 被轉接者。
 */
public class Adaptee {
    private final String foobar = "foobar";

    public String specificRequest() {
        return foobar;
    }
}
