package com.mkangelo.javetests.retos;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumbersShould {
    @Test
    public void return_first_10_roman_numbers() {
        RomanNumbers rm = new RomanNumbers();
        assertEquals("I", rm.toRoman(1));
        assertEquals("II", rm.toRoman(2));
        assertEquals("III", rm.toRoman(3));
        assertEquals("IV", rm.toRoman(4));
        assertEquals("V", rm.toRoman(5));
        assertEquals("VI", rm.toRoman(6));
        assertEquals("VII", rm.toRoman(7));
        assertEquals("VIII", rm.toRoman(8));
        assertEquals("IX", rm.toRoman(9));
        assertEquals("X", rm.toRoman(10));
    }

    @Test
    public void return_numbers_between_11_to_100(){
        RomanNumbers rm = new RomanNumbers();
        assertEquals("XI", rm.toRoman(11));
        assertEquals("XXV", rm.toRoman(25));
        assertEquals("XXXVII", rm.toRoman(37));
        assertEquals("ILI", rm.toRoman(41));
        assertEquals("LIII", rm.toRoman(53));
        assertEquals("LXIV", rm.toRoman(64));
        assertEquals("LXXVIII", rm.toRoman(78));
        assertEquals("LXXXIX", rm.toRoman(89));
        assertEquals("XCIX", rm.toRoman(99));
        assertEquals("C", rm.toRoman(100));
    }

    @Test
    public void return_numbers_between_101_to_1000(){
        RomanNumbers rm = new RomanNumbers();
        assertEquals("CXI", rm.toRoman(111));
        assertEquals("CDLXVII", rm.toRoman(467));
        assertEquals("DLXXII", rm.toRoman(572));
        assertEquals("CCLVI", rm.toRoman(256));
        assertEquals("CMXCIX", rm.toRoman(999));
        assertEquals("M", rm.toRoman(1000));
        assertEquals("CXLV", rm.toRoman(145));
        assertEquals("DCLVII", rm.toRoman(657));
        assertEquals("DCCCXCVI", rm.toRoman(896));
        assertEquals("CCCLX", rm.toRoman(360));
    }
}