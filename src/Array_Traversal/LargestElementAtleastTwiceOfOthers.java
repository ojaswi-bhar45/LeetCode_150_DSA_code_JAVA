//https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/

package Array_Traversal;

public class LargestElementAtleastTwiceOfOthers {
    public static int dominantIdx(int[] nums){
        int largestNumber = nums[0];
        int largestIdx = 0;

        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] > largestNumber){
                largestNumber = nums[i];
                largestIdx = i;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(i != largestIdx && largestNumber < 2 * nums[i]){
                return -1;
            }
        }
        return largestIdx;
    }
    public static void main(String[] args) {
        int[] nums = {3,6,1,0};

        int result = dominantIdx(nums);
        System.out.println(result);
    }
}
