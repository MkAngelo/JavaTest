package com.mkangelo.javetests.util;

public class StringUtilTest {
    public static void main(String[] args) {

        String result = StringUtil.repeat("Hola", 3);
        System.out.println(result);

        String result2 = StringUtil.repeat("hola", 1);
        System.out.println(result2);
    }
}