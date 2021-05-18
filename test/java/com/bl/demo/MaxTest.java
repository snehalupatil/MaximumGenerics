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

    @Test
    public void testPasses_ForFloat_WhenReturnsMaximum(){
        Assert.assertEquals(10.7f, maxObject.getMaximum(new float[]{2.3f,5.2f,10.7f}),0);
    }
    
}
