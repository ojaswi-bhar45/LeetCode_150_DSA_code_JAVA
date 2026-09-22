//https://leetcode.com/problems/maximum-sum-circular-subarray/description/
//918

package kadens_algorithm;

public class max_circular_subarray {

    public static int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxEnd = nums[0];
        int minEnd = nums[0];
        int maxSum = nums[0];
        int minSum = nums[0];

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 1; i < nums.length; i++) {
            maxEnd = Math.max(nums[i], maxEnd + nums[i]);
            maxSum = Math.max(maxSum, maxEnd);

            minEnd = Math.min(nums[i], minEnd + nums[i]);
            minSum = Math.min(minSum, minEnd);
        }

        if (maxSum > 0) {
            return Math.max(maxSum, totalSum - minSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, -2, 3, -2};
        int[] nums2 = {5, -3, 5};
        int[] nums3 = {-3, -2, -3};
        int[] nums4 = {3, -1, 2, -1};

        System.out.println(maxSubarraySumCircular(nums));
        System.out.println(maxSubarraySumCircular(nums2));
        System.out.println(maxSubarraySumCircular(nums3));
        System.out.println(maxSubarraySumCircular(nums4));
    }
}