package com.recursion.factorial;

public class BunnyEars {
    public int bunnyEars(int bunnies) {

        if(bunnies==0){
            return bunnies;
        }

        return bunnyEars(bunnies-1)+2;
    }
}
