package com.recursion.factorial;

public class SumDigits {
    public int sumDigits(int n) {

        if (n / 10 > 0) {

            return sumDigits(n / 10) + n % 10;
        } else return n;


    }

}
