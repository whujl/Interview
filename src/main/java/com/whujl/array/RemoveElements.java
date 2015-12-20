package com.whujl.array;

/**
 * Created by whujl on 15/11/30.
 */
public class RemoveElements {

    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveElements().removeElement(new int[]{1, 2, 2, 3}, 2));
    }

}
