package com.whujl.array;

import java.util.Arrays;

/**
 * Created by whujl on 15/11/30.
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0){
            return digits;
        }

        int length = digits.length;

        boolean needCarryOver = true;

        for (int i = length - 1; i >= 0; i--) {
            if (needCarryOver) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i] = digits[i] + 1;
                    needCarryOver = false;
                }

                if (i == 0 && digits[i] == 0) {
                    int[] y = new int[length + 1];
                    y[0] = 1;
                    System.arraycopy(digits, 0, y, 1, length);
                    digits = y;
                }
            }
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] a = new int[]{9, 9, 9, 9, 9};
        System.out.println(Arrays.toString(new PlusOne().plusOne(a)));
    }

}
