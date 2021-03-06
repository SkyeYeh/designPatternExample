package com.skyeyeh.designpatternexample.structural.composite;

/**
 * Created by Skye on 2016/2/18.
 * 定義樹狀結構中的物件(不管是合成或葉節點)所應該具備的一切，
 */
public interface Component {
    /**
     * 是一個操作方法，這個方法同時被合成以及葉節點所實踐。
     */
    default void operation() {
        throw new UnsupportedOperationException();
    }

    /**
     * 新增子節點。
     *
     * @param component 子節點
     */
    default void add(Component component) {
        throw new UnsupportedOperationException();
    }

    /**
     * 移除子節點。
     *
     * @param component 子節點
     */
    default void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    /**
     * 取得子節點。
     *
     * @param index 索引
     * @return 子節點
     */
    default Component getChild(int index) {
        throw new UnsupportedOperationException();
    }
}
