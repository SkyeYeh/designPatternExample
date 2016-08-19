package com.skyeyeh.designpatternexample.structural.composite;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Skye on 2016/2/18.
 * 葉節點，沒有子節點。
 */
public class Leaf implements Component {
    private static final Logger LOGGER = Logger.getLogger(Leaf.class.getName());

    String foobar;

    public Leaf(String foobar) {
        this.foobar = foobar;
    }

    /**
     * 印出葉節點參數。
     */
    @Override
    public void operation() {
        LOGGER.log(Level.INFO, foobar);
    }
}
