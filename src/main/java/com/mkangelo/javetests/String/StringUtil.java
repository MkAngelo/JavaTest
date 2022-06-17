package com.mkangelo.javetests.String;

public class StringUtil {
    public static boolean isEmpty(String userStr){
        return userStr == null || userStr.trim().equals("");
    }
}
