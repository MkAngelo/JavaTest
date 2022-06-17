package com.mkangelo.javetests.String;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {
    @Test
    public void notEmptyStr() {
        StringUtil str = new StringUtil();
        assertFalse(str.isEmpty("NO ESTOY VACIO XD"));
    }
    @Test
    public void isEmptyStr() {
        StringUtil str = new StringUtil();
        assertTrue(str.isEmpty(""));
    }
    @Test
    public void isNullStr() {
        StringUtil str = new StringUtil();
        assertTrue(str.isEmpty(null));
    }
    @Test
    public void isSpaceStr() {
        StringUtil str = new StringUtil();
        assertTrue(str.isEmpty("    "));
    }
}