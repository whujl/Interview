package com.whujl.array;

/**
 * Created by whujl on 15/11/29.
 */
public class MoveZeros {

    public int addDigits(int num) {
        return (num % 9 == 0 && num != 0) ? 9 : num % 9;
    }

    public static void main(String[] args) {
        System.out.println(5 % 4 != 0);
    }
}
