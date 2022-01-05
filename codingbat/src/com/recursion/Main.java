package com.recursion;

import com.recursion.factorial.*;

public class Main {
    public static void main(String[] args) {
        SumDigits fibonacci = new SumDigits();
        int fibonacci1 = fibonacci.sumDigits(170);
        System.out.println("sum Digits" + fibonacci1);

    }
}
