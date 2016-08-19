package com.skyeyeh.designpatternexample.structural.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Skye on 2016/2/2.
 * 實作反覆器。
 */
public class IteratorImpl implements Iterator {
    String[] strings;
    int position = 0;

    public IteratorImpl(String[] strings) {
        this.strings = strings;
    }

    /**
     * 返回一個布林值，讓我們得知是否還有更多的元素。
     *
     * @return 是否還有更多的元素
     */
    @Override
    public boolean hasNext() {
        return position < strings.length && strings[position] != null;
    }

    /**
     * 取得下一個元素。
     *
     * @return 下一個元素
     */
    @Override
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        String result = strings[position];
        position++;
        return result;
    }

    /**
     * 實踐移除方法，被刪除的物件之後的每一個物件，都往前移動一個位置。
     */
    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException();
        }
        if (strings[position - 1] != null) {
            System.arraycopy(strings, position, strings, position - 1, strings.length - position);
            strings[strings.length - 1] = null;
        }
    }
}
