//https://leetcode.com/problems/maximum-subarray/description/
//53

package kadens_algorithm;

public class maximum_subarray {

    public static int maxSubArray(int[] nums) {
        int best = nums[0];
        int current = nums[0];

        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            best = Math.max(best, current);
        }

        return best;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1};
        int[] nums3 = {5, 4, -1, 7, 8};

        System.out.println(maxSubArray(nums));
        System.out.println(maxSubArray(nums2));
        System.out.println(maxSubArray(nums3));
    }
}