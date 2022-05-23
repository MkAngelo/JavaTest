package com.mkangelo.javetests.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public void repeat_string_once() {
        Assert.assertEquals(StringUtil.repeat("hola", 1), "hola");
    }

    @Test
    public void repeat_string_multiple_times() {
        Assert.assertEquals(StringUtil.repeat("hola", 3), "holaholahola");
    }

    @Test
    public void repeat_string_zero_times(){
        Assert.assertEquals(StringUtil.repeat("hola", 0), "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times(){
        StringUtil.repeat("hola", -1);
    }
}