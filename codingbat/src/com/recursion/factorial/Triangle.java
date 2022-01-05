package com.recursion.factorial;

public class Triangle {
    public int triangle(int rows) {

        if (rows == 0) {
            return rows;
        }

        return triangle(rows - 1) + rows;
    }

}
