package com.mkangelo.javetests.retos;

import org.junit.Test;

import java.nio.file.FileStore;

import static org.junit.Assert.*;

public class FizzBuzzShould {
    @Test
    public void return_fizz_when_number_is_divisible_by_3(){
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Fizz", fb.check(3));
        assertEquals("Fizz", fb.check(9));
        assertEquals("Fizz", fb.check(12));
    }

    @Test
    public void return_buzz_when_number_is_divisible_by_5() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Buzz", fb.check(5));
        assertEquals("Buzz", fb.check(10));
        assertEquals("Buzz", fb.check(50));
    }

    @Test
    public void return_fizzbuzz_when_number_is_divisible_by_3_and_5(){
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzBuzz", fb.check(300));
        assertEquals("FizzBuzz", fb.check(30));
        assertEquals("FizzBuzz", fb.check(15));
    }

    @Test
    public void return_number_when_is_not_divisible_by_3_or_5() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1", fb.check(1));
        assertEquals("2", fb.check(2));
        assertEquals("41", fb.check(41));
    }
}