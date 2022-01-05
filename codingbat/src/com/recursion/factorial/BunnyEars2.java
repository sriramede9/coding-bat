package com.recursion.factorial;

public class BunnyEars2 {
    public int bunnyEars2(int bunnies) {

        if (bunnies == 0) {
            return bunnies;
        }
        if (bunnies % 2 == 0) {
            return bunnyEars2(bunnies - 1) + 3;
        } else return bunnyEars2(bunnies - 1) + 2;


//        return bunnyEars2(bunnies-1)+2;
    }
}
