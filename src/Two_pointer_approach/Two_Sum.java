//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

package Two_pointer_approach;

public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] nums2 = { 2, 3, 4};
        int target2 = 6;

        int[] result = twoSum(nums, target);
        int[] result2 = twoSum(nums2, target2);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");
    }
}
