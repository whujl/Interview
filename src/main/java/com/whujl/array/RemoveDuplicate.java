package com.whujl.array;

/**
 * Created by whujl on 15/11/30.
 */
public class RemoveDuplicate {

    public int removeDuplicates(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }

        int result=0;
        for(int index=1; index< nums.length; index++){
            if(nums[index]!=nums[result]){
                nums[++result]=nums[index];
            }
        }
        return result+1;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,2};
        System.out.println(new RemoveDuplicate().removeDuplicates(a));
    }
}
