package com.skyeYeh.designPatternExample.structural.composite;

/**
 * Created by Skye on 2016/2/18.
 * 葉節點，沒有子節點。
 */
public class Leaf extends Component {
    String foobar;

    public Leaf(String foobar) {
        this.foobar = foobar;
    }

    /**
     * 印出葉節點參數。
     */
    @Override
    void operation() {
        System.out.println(foobar);
    }
}
