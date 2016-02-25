package com.skyeyeh.designpatternexample.structural.objectAdapter;

/**
 * Created by Skye on 2016/1/29.
 * 轉接器介面。
 */
@FunctionalInterface
public interface Target {
    /**
     * 請求。
     * @return 回傳值
     */
    public String request();
}
