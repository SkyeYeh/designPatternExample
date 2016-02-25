package com.skyeyeh.designpatternexample.structural.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Skye on 2016/2/2.
 * 實作客戶。
 */
public class AggregateImpl2 implements Aggregate {
    List<String> stringList;

    public AggregateImpl2() {
        stringList = new ArrayList<>();
        stringList.add("foobar1");
        stringList.add("foobar2");
        stringList.add("foobar3");
    }

    /**
     * 這個具象聚集持有一個物件的聚合，並實踐一個方法，利用此方法傳出相關的反覆器。
     *
     * @return 反覆器
     */
    @Override
    public Iterator createIterator() {
        return stringList.iterator();
    }
}
