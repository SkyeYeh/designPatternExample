package com.skyeyeh.designpatternexample.structural.objectAdapter;

/**
 * Created by Skye on 2016/1/29.
 * 轉接器。
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 請求，將 specificRequest 轉成 request。
     *
     * @return 回傳值
     */
    @Override
    public String request() {
        return adaptee.specificRequest() + "2";
    }
}
