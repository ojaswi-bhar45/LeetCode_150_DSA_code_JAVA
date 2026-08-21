//https://leetcode.com/problems/squares-of-a-sorted-array/description/
//977

package Two_pointer_approach;

import java.util.Arrays;

public class Square_Of_Sorted_array {
    public static int[] squareElements(int[] nums){
        int n = nums.length;
        int left  = 0;
        int right = n - 1;
        int[] res = new int[n];
        int position = n - 1;

        while(left < right){
            int left_square = nums[left] * nums[left];
            int right_square = nums[right] * nums[right];

            if(left_square > right_square){
                res[position] = left_square;
                left ++;
            }else{
                res[position] = right_square;
                right --;
            }
            position --;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] res = squareElements(nums);
        System.out.println(Arrays.toString(res));


        int[] nums2 = {-7,-3,2,3,11};
        int[] res2 = squareElements(nums2);
        System.out.println(Arrays.toString(res2));


    }
}
