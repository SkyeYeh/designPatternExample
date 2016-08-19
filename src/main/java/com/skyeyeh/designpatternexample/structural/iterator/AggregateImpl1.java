package com.skyeyeh.designpatternexample.structural.iterator;

import java.util.Iterator;

/**
 * Created by Skye on 2016/2/2.
 * 實作客戶。
 */
public class AggregateImpl1 implements Aggregate {
    String[] strings;

    public AggregateImpl1() {
        strings = new String[]{"foobar1", "foobar2", "foobar3"};
    }

    /**
     * 這個具象聚集持有一個物件的聚合，並實踐一個方法，利用此方法傳出相關的反覆器。
     *
     * @return 反覆器
     */
    @Override
    public Iterator<String> createIterator() {
        return new IteratorImpl(strings);
    }
}
