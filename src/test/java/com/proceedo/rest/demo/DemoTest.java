package com.proceedo.rest.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

    @Test
    public void demoTest() {
        // given
        int a = 10;
        int b = 78;

        // when
        int result = a + b;

        // then
        Assert.assertEquals(result, 88);
    }
}
