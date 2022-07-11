package com.mkangelo.javetests.retos;

import java.util.HashMap;
import java.util.Map;

public class RomanNumbers {
    public String toRoman(int num) {
        StringBuilder ans = new StringBuilder();
        while(num > 0){
            int temp;
            if( num > 100 && num <= 1000){
                temp = num / 100;
                ans.append(search_num(temp*100, 100));
                num -= temp * 100;
            } else if( num > 10 && num <= 100){
                temp = num / 10;
                ans.append(search_num(temp*10,10));
                num -= temp * 10;
            } else if( num <= 10 ){
                ans.append(search_num(num, 1));
                num -= num;
            }
        }
        return ans.toString();
    }
    public String search_num(int num, int times){
        Map<Integer, String> ref = new HashMap<>();
        ref.put(1, "I");
        ref.put(4, "IV");
        ref.put(5, "V");
        ref.put(9, "IX");
        ref.put(10, "X");
        ref.put(40, "XL");
        ref.put(50, "L");
        ref.put(90, "XC");
        ref.put(100, "C");
        ref.put(400, "CD");
        ref.put(500, "D");
        ref.put(900, "CM");
        ref.put(1000, "M");
        StringBuilder ans = new StringBuilder();

        if(num == (times) || num == (4 * times) || num == (5 * times) || num == (9 * times) || num == (10 * times))
            ans.append(ref.get(num));
        else{
            if(num < (4 * times)){
                for (int i = 0; i < (num / times); i++)
                    ans.append(ref.get(times));
            } else{
                ans.append(ref.get(5 * times));
                num -= 5*times;
                for (int i = 0; i < (num/times); i++)
                    ans.append(ref.get(times));
            }
        }

        return ans.toString();
    }
}
