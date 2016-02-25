package com.skyeyeh.designpatternexample.structural.iterator;

import java.util.Iterator;

/**
 * Created by Skye on 2016/2/2.
 * 客戶介面。
 */
@FunctionalInterface
public interface Aggregate {
    /**
     * 這個具象聚集持有一個物件的聚合，並實踐一個方法，利用此方法傳出相關的反覆器。
     *
     * @return 反覆器
     */
    Iterator createIterator();
}
