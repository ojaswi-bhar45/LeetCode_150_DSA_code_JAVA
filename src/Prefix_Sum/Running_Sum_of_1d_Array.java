//https://leetcode.com/problems/running-sum-of-1d-array/description/
//1480

package Prefix_Sum;

import java.util.Arrays;

public class Running_Sum_of_1d_Array {

    public static int[] runningSum(int[] nums){
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            prefix[i]  = prefix[i-1]+nums[i];
        }

        return prefix;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));

        int[] nums2 = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums2)));

    }
}