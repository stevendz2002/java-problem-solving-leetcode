
package com.steven.algorithms.arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        if (nums == null) {
            return new int[0];
        }

        for(int i=0; i < nums.length;i++){
            for(int j=i+1; j < nums.length;j++){
                if ((nums[i] + nums[j]) == target){
                    int array [] = new int[2];
                    array[0] = i;
                    array[1] = j;
                    return array;
                }
            }
        }
        return new int[0];
    }
}
