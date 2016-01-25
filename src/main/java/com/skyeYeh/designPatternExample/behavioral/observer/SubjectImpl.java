package com.skyeYeh.designPatternExample.behavioral.observer;

import java.util.ArrayList;

/**
 * Created by Skye on 2016/1/25.
 * 主題。
 */
public class SubjectImpl implements Subject {
    // 已註冊之觀察者。
    private ArrayList<Observer> observers;
    private String foobar1;
    private String foobar2;

    public SubjectImpl() {
        observers = new ArrayList<>();
    }

    /**
     * 實作註冊觀察者。
     *
     * @param observer 觀察者
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 實作移除觀察者。
     *
     * @param observer 觀察者
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 實作當主題狀態改變時通知所有觀察者。
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(foobar1, foobar2);
        }
    }

    /**
     * 改變主題狀態。
     *
     * @param foobar1 參數1
     * @param foobar2 參數2
     */
    public void setStatus(String foobar1, String foobar2) {
        this.foobar1 = foobar1;
        this.foobar2 = foobar2;
        // 實作當主題狀態改變時通知所有觀察者。
        notifyObservers();
    }

    /**
     * 回傳此主題的觀察者數量。
     *
     * @return 此主題的觀察者數量。
     */
    public int countObservers() {
        return observers.size();
    }
}
