package com.whujl.array;

/**
 * Created by whujl on 15/11/30.
 */
public class MissingNumber {

    public int missingNumber(int[] nums){
        int xor = 0;
        for(int i = 1; i <= nums.length; ++i) {
            xor ^= i;
        }

        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }

    public static void main(String[] args) {
        int[] a = new int[]{0, 1, 2, 3, 4, 6, 7};
        System.out.println(new MissingNumber().missingNumber(a));
    }

}
