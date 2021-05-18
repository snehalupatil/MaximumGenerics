package com.bl.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class MaxTest {
    Max maxObj;

    @Before
    public void init(){
        maxObj = new Max();
    }

    @Test
    public void testPass_WhenReturnMaximun(){
        Assert.assertEquals(12,maxObj.getMaximum(new int[]{2,6,12}));
    }
}
