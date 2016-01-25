package com.skyeYeh.designPatternExample.behavioral.observer;

/**
 * Created by Skye on 2016/1/25.
 * 主題介面。
 */
public interface Subject {
    /**
     * 註冊觀察者。
     *
     * @param observer 觀察者
     */
    public void registerObserver(Observer observer);

    /**
     * 移除觀察者。
     *
     * @param observer 觀察者
     */
    public void removeObserver(Observer observer);

    /**
     * 當主題狀態改變時通知所有觀察者。
     */
    public void notifyObservers();
}
