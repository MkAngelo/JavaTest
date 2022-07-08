package com.mkangelo.javetests.retos;

public class FizzBuzz {

    public String check(int num) {
        String ans = "";
        if(num % 3 == 0)
            ans += "Fizz";
        if(num % 5 == 0)
            ans += "Buzz";
        if (ans.isEmpty())
            ans += Integer.toString(num);
        return ans;
    }
}
