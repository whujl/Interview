package com.whujl.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by whujl on 15/11/29.
 */
public class SummaryRange {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>(nums.length);
        if (nums == null || nums.length == 0) {
            return result;
        }

        if (nums.length == 0) {
            result.add(nums[0] + "");
            return result;
        }

        int first = nums[0], pre = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - pre == 1) {
                result.add(first + "->" + nums[i]);
            }else{
                if(first == pre){
                    result.add(first+"");
                }else{
//                    result.add()
                }
            }
        }

        return result;
    }
}
