package com.skyeYeh.designPatternExample.structural.classAdapter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Skye on 2016/1/29.
 */
public class AdapterTest {
    Target target;

    @Before
    public void setUp() throws Exception {
        target = new Adapter();
    }

    @Test
    public void testRequest() throws Exception {
        Assert.assertEquals("foobar2", target.request());
    }
}