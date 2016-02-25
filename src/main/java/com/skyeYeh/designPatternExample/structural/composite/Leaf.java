package com.skyeyeh.designpatternexample.structural.composite;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Skye on 2016/2/18.
 * 葉節點，沒有子節點。
 */
public class Leaf implements Component {
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    String foobar;

    public Leaf(String foobar) {
        this.foobar = foobar;
    }

    /**
     * 印出葉節點參數。
     */
    @Override
    public void operation() {
        logger.log(Level.INFO, foobar);
    }
}
