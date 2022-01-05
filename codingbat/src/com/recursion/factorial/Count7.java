package com.recursion.factorial;

public class Count7 {

    public int count7(int n) {
        int count = 0;
        if (n / 10 > 0 || n == 7) {

            if (n % 10 == 7) {
                return count + 1 + count7(n / 10);
            } else return count + count7(n / 10);

        }
        return count;
    }

}
