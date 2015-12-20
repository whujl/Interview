package com.whujl.array;

/**
 * Created by whujl on 15/11/30.
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) {
            return;
        }

        k = k % nums.length;

        int a = nums.length - k;

        reverse(nums, 0, a -1);
        reverse(nums, a, nums.length-1);
        reverse(nums, 0 , nums.length-1);
    }

    void reverse(int[] toReverse, int left, int right){
        while(left < right){
            int temp = toReverse[left];
            toReverse[left] = toReverse[right];
            toReverse[right] = temp;
            left++;
            right--;
        }
    }
}
