package com.skyeyeh.designpatternexample.behavioral.observer;

/**
 * Created by Skye on 2016/1/25.
 * 觀察者介面。
 */
@FunctionalInterface
public interface Observer {
    /**
     * 當主題改變時呼叫。
     *
     * @param footbar1 參數1
     * @param footbar2 參數2
     */
    public void update(String footbar1, String footbar2);
}
