package com.skyeyeh.designpatternexample.behavioral.observer;

/**
 * Created by Skye on 2016/1/25.
 * 觀察者。
 */
public class ObserverImpl1 implements Observer {
    Subject subject;
    String foobar1;
    String foobar2;

    /**
     * 使用主題註冊觀察者。
     *
     * @param subject 主題。
     */
    public ObserverImpl1(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    /**
     * 實作當主題改變時呼叫。
     *
     * @param foobar1 參數1
     * @param foobar2 參數2
     */
    @Override
    public void update(String foobar1, String foobar2) {
        this.foobar1 = foobar1;
        this.foobar2 = foobar2;
    }
}
